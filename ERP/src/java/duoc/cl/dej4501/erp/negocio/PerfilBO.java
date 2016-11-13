/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.dej4501.erp.negocio;

import duoc.cl.dej4501.erp.entidades.Perfil;
import duoc.cl.dej4501.erp.persistencia.PerfilDAO;
import java.util.List;

/**
 *
 * @author NicolasValenciaY
 */
public class PerfilBO {
    private PerfilDAO objPerfilDAO;

    public PerfilBO() {
        objPerfilDAO=new PerfilDAO();
    }
    
    public boolean agregarPerfil(Perfil objPerfil){
        return objPerfilDAO.addElemento(objPerfil);
    }
    
    public List<Perfil>listadoPerfiles(){
        return objPerfilDAO.readElementos();
    }
}
