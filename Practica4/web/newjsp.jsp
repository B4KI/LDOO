<%-- 
    Document   : newjsp
    Created on : 21/09/2018, 07:03:36 PM
    Author     : Yair
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel='stylesheet' type='text/css' href='newcss.css' />

    </head>
    <body>
        <h1>Registro</h1>

        <div id="title">Formulario</div>


        <form action="newjsp1.jsp" method="post">
            <div>
                <label for="name">Nombre:</label>
                  <input type="text" name="user" id="user">
            </div>
            <div>
                <label for="name">Apellido Paterno:</label>
                <input type="text" name="apellidoP" id="user">
            </div>
            <div>
                <label for="name">Apellido Materno:</label>
                <input type="text" name="apellidoM" id="user">
            </div>
            <div>
                <label for="name">Fecha de nacimiento:</label>
                <input type="date" name="nac" id="user">
            </div>
            <div>
                 <label for="mail">E-mail:</label>
                    <input type="email" name="email" id="user">
            </div>
            <div>
                 <label for="pass">contraseña:</label>
                 <input type="password" name="pass" id="user">
            </div>
            <div class="button">
                 <button type="submit">Enviar</button>
            </div>
        </form>

    </body>
</html>
