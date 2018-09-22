<%-- 
    Document   : newjsp1
    Created on : 21/09/2018, 07:21:12 PM
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
        <h1>Datos personales</h1>
        <% String user = request.getParameter("user");
            String apellidoP = request.getParameter("apellidoP");
            String apellidoM = request.getParameter("apellidoM");
            String nac = request.getParameter("nac");
            String email = request.getParameter("email");
            String pass = request.getParameter("pass");%>


        <table>
            <tr>
                <td>
                    <% out.println("<h3>mi IP es: </h3>" + request.getRemoteAddr());%><br>
                    <% out.println("<h3>Nombre: </h3>" + user);%><br>
                    <% out.println("<h3>Apellido Paterno: </h3>" + apellidoP);%><br>
                    <% out.println("<h3>Apellido Materno: </h3>" + apellidoM);%><br>
                    <% out.println("<h3>Fecha de nacimiento: </h3>" + nac);%><br>
                    <% out.println("<h3>Correo electronico: </h3>" + email);%><br>
                    <% out.println("<h3>Contraseña: </h3>" + pass);%>
                </td>
            </tr>
        </table>
    </body>
</html>
