/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.dej4501.erp.negocio;

import duoc.cl.dej4501.erp.entidades.Usuario;
import duoc.cl.dej4501.erp.persistencia.UsuarioDAO;
import java.util.List;

/**
 *
 * @author NicolasValenciaY
 */
public class UsuarioBO {
    private UsuarioDAO objUsuarioDAO;

    public UsuarioBO() {
        this.objUsuarioDAO=new UsuarioDAO();
    }
    
    public boolean agregarUsuario(Usuario objUsuario){
        return this.objUsuarioDAO.addElemento(objUsuario);
    }
    
    public List<Usuario>listadoUsuarios(){
        return this.objUsuarioDAO.readElementos();
    }
    
    public boolean validaUsuario(String user,String pass){
        return this.objUsuarioDAO.validarUsuario(user, pass);
    }
    
}
