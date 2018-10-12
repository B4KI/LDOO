<%-- 
    Document   : resultado
    Created on : 11/10/2018, 01:19:36 PM
    Author     : Yair
--%>

<%@page import="modelo.Modelo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
        
        <% Modelo m = (Modelo)request.getSession().getAttribute("persona1");%>
        
    </head>
    <body>
        <h1>
            <%=m.getUser()%>
            <%=m.getApellidoP()%>
            <%=m.getApellidoM()%>
            <%=m.getNac()%>
            <%=m.getEmail()%>
            <%=m.getPass()%>
            
        </h1>
            
            
            
    </body>
</html>
