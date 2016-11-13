/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.dej4501.erp.presentacion;

import duoc.cl.dej4501.erp.entidades.Usuario;
import duoc.cl.dej4501.erp.negocio.UsuarioBO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NicolasValenciaY
 */
@WebServlet(name = "GuardarUsuarioServlet", urlPatterns = {"/guardarUsuarioServlet"})
public class GuardarUsuarioServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GuardarUsuarioServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GuardarUsuarioServlet at " + request.getContextPath() + "</h1>");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Usuario objUsuario;
        HttpSession sesion=request.getSession();
        String username=request.getParameter("txtUsername");
        String password=request.getParameter("txtPassword");
        String nombre=request.getParameter("txtNombre");
        String apellido=request.getParameter("txtApellido");
        String correo=request.getParameter("txtCorreo");
        int edad=Integer.parseInt(request.getParameter("txtEdad"));
        int codigoPerfil=Integer.parseInt(request.getParameter("txtCodPerfil"));
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/mm/yyyy");
        Date fechaNacimiento=null;
        try {
            fechaNacimiento=formatoFecha.parse("txtFechaNacimiento");
        } catch (Exception e) {
        }
        objUsuario=new Usuario(username, password, nombre, apellido, correo, edad, codigoPerfil, fechaNacimiento);
        UsuarioBO objUsuarioBO=new UsuarioBO();
        if(objUsuarioBO.agregarUsuario(objUsuario)){
            sesion.setAttribute("msgIngresoUsuario", "Ingresado exitosamente");
        }else{
            sesion.setAttribute("msgIngresoUsuario", "Error en el ingreso del usuario");
        }
        response.sendRedirect("RegistrarUsuario.jsp");
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
