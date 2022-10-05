/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static com.sun.jndi.ldap.LdapPoolManager.debug;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "muestraSuma", urlPatterns = {"/muestraSuma"})
public class muestraSuma extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType(" text/html; charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {

            if (request.getAttribute("flag") != null) {
                request.setAttribute("falg", 1);
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            } else {
                String n1 = request.getParameter("num1");
                String n2 = request.getParameter("num2");
                model.Suma s = new model.Suma(n1, n2);
                s.hacerSuma();
                int resultado = s.getResultado();
                request.setAttribute("sumaResuelta", s);
                request.getRequestDispatcher("/muestraResultado.jsp").forward(request, response);
            }
        }

    }

    
    private void doBeforeProcesssing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        if (debug) {
            log("prueba:DoBeforeProcessing");
        }
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");

        if (n1 != null && n2 != null) {
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            if (num1>10 || num2 >10) {
                request.setAttribute("flag", 1);
            }
            

        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    @Override
    public String getServletInfo() {
        return "short descripcion";
    }

}
