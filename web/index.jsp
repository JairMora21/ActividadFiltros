<%-- 
    Document   : index
    Created on : 20 sep. 2022, 15:11:59
    Author     : JAIR
--%>
<%@page import="java.util.Enumeration" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.muestraSuma" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% 
        if (request.getAttribute("flag")!=null){
        out.print("<h1>No puedes sumar numeros mayores a 10 </h1>");
            }
        %>
        <form action="muestraSuma" method="post">
            Numero 1: <br>
            <input type="text" name="num1" value="" ><br>
            Numero 2: <br>
            <input type="text" name="num2" value="" ><br><br>
            <input type="submit" value="Sumar!">
        </form>
    </body>
</html>
