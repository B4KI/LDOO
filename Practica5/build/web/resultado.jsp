<%-- 
    Document   : resultado
    Created on : 11/10/2018, 02:34:25 PM
    Author     : Yair
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <%
            String name = request.getParameter("c");
        %>

        <h1> <%=name%> </h1>

    </body>
</html>
