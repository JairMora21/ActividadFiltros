<%-- 
    Document   : muestraResultado
    Created on : 20 sep. 2022, 15:12:15
    Author     : JAIR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Suma"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%   Suma s = (Suma) request.getAttribute("sumaResuelta");  %>
        <h1>El resultado de sumar</h1>
        <%=s.getNum1()%>
        <h1> + </h1>
        <%=s.getNum2()%>
        <h1> es </h1>
        <%=s.getResultado()%>
        <br>
        
        <a href="index.jsp"> Hacer otra suma </a>
    </body>
</html>
