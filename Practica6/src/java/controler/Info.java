/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Modelo;

/**
 *
 * @author Yair
 */
public class Info extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String user = request.getParameter("user");
            String apellidoP = request.getParameter("apellidoP");
            String apellidoM = request.getParameter("apellidoM");
            String nac = request.getParameter("nac");
            String email = request.getParameter("email");
            String pass = request.getParameter("pass");
            
            if((user==null) || (user.equals(""))){
              response.sendRedirect("error.jsp");
            }else
            if((apellidoP==null) || (apellidoP.equals(""))){
              response.sendRedirect("error.jsp");
            }else
             if((apellidoM==null) || (apellidoM.equals(""))){
                  response.sendRedirect("error.jsp");
             }else
             if((nac==null) || (nac.equals(""))){
                 response.sendRedirect("error.jsp");
             }else
                 if((email==null) || (email.equals(""))){
                 response.sendRedirect("error.jsp");
             }else
                     if((pass==null) || (pass.equals(""))){
                 response.sendRedirect("error.jsp");
             }else
             {
                 
                 Modelo m = new Modelo(user,apellidoP,apellidoM,nac,email,pass);
                 request.getSession().setAttribute("persona1",m);
                 request.getRequestDispatcher("resultado.jsp").forward(request,response);
                 }

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Info</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("<h2>Aqui estan tus datos</h2>");

            out.println("<h3>Nombre: </h3>" + user + "</br>");
            out.println("<h3>Apellido paterno: </h3>" + apellidoP + "</br>");
            out.println("<h3>Apellido materno: </h3>" + apellidoM + "</br>");
            out.println("<h3>Fecha de nacimento: </h3>" + nac + "</br>");
            out.println("<h3>Correo electronico: </h3>" + email + "</br>");
            out.println("<h3>Contraseña: </h3>" + pass + "</br>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
