<%-- 
    Document   : index
    Created on : 26/10/2018, 03:50:59 AM
    Author     : Yair
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesión</title>
    </head>
    <body>
        <h1>Iniciar sesión</h1>
        
        <form action=" " method="post">
            
            
            <label>Nombre</label>
            <input type="text" name="usuario"/><br/>
            <label>Contraseña</label>
            <input type="password" name="contraseña"/><br/>
            <input type="submit" value="Iniiciar Sesión">
            
            
            
        </form>
        <br/>
        No tienes una cuenta... <a href="registro.jsp">Registro</a>
        
    </body>
</html>
