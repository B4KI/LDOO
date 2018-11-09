<%-- 
    Document   : registros
    Created on : 03/11/2018, 03:35:33 AM
    Author     : Yair
--%>

<%@page import="java.util.List"%>
<%@page import="modelo.usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registros</title>
       <% 
        List l = (List)session.getAttribute("registros");
        %>
        
    </head>
    <body>
        <h1> Registros de usuarios: </h1> <br>
        <%  for(Object o: l){     
            usuario u = (usuario) o ; %>
            
            Correo: <%=u.getCorreo()%><br>
           
            Password: <%=u.getPassword()%><br><br>
            
        <%} %>
    </body>
</html>
