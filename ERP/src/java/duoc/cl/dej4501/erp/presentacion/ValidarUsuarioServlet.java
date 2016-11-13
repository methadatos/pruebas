/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.dej4501.erp.presentacion;

import duoc.cl.dej4501.erp.negocio.UsuarioBO;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ValidarUsuarioServlet", urlPatterns = {"/validarUsuarioServlet","validarUsuario"})
public class ValidarUsuarioServlet extends HttpServlet {


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
        HttpSession sesion=request.getSession();
        String usuario=request.getParameter("txtUsername");
        String password=request.getParameter("txtPass");
        UsuarioBO objUsuarioBO=new UsuarioBO();
        if(objUsuarioBO.validaUsuario(usuario, password)){
            sesion.setAttribute("usuarioConectado", objUsuarioBO);
            response.sendRedirect("Home.jsp");
        }else{
            response.sendRedirect("Login.jsp");
        }
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
