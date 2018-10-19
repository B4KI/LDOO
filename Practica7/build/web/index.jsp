<%-- 
    Document   : newjsp
    Created on : 19/10/2018, 12:31:07 AM
    Author     : Yair
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>

        <form action="AddCookie" method="post">
            Nombre :<input type="text" name="user">
            Contraseña :<input type="password" name="pass">
            <input type="submit" value="Enviar">
        </form>

    </body>
</html>
