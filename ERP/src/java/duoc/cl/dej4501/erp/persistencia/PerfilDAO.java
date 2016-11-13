/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.dej4501.erp.persistencia;

import duoc.cl.dej4501.erp.entidades.Perfil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author NicolasValenciaY
 */
public class PerfilDAO implements ICrud{

    public PerfilDAO() {
    }

    @Override
    public boolean addElemento(Object objetoInsert) {
        Perfil objPerfil=(Perfil)objetoInsert;
        try {
            Connection con=Conexion.getConexion();
            String query="insert into perfil values(?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, objPerfil.getCodigoPerfil());
            ps.setString(2, objPerfil.getDescripcion());
            if(ps.executeUpdate()==1){
                System.out.println("Perfil ingresado exitosamente");
                return true;
            }
            
        } catch (Exception e) {
            System.out.println("Error en el ingreso del perfil");
        }
        return false;
    }

    @Override
    public List readElementos() {
        List<Perfil>listadoPerfiles=new LinkedList<>();
        Perfil objPerfil;
        try {
            Connection con=Conexion.getConexion();
            String query="";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                objPerfil=new Perfil(rs.getInt(1),rs.getString(2));
                listadoPerfiles.add(objPerfil);
            }
        } catch (Exception e) {
        }
        return listadoPerfiles;
    }

    @Override
    public boolean updateElemento(Object objetoUpdate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteElemento(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
