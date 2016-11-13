/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.dej4501.erp.persistencia;

import duoc.cl.dej4501.erp.entidades.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author NicolasValenciaY
 */
public class UsuarioDAO implements ICrud{

    public UsuarioDAO() {
    }

    @Override
    public boolean addElemento(Object objetoInsert) {
        Usuario objUsuario=(Usuario)objetoInsert;
        try {
            Connection con=Conexion.getConexion();
            String sql="insert into usuario values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idUsuario());
            ps.setString(2, objUsuario.getUsername());
            ps.setString(3, objUsuario.getPassword());
            ps.setString(4, objUsuario.getNombre());
            ps.setString(5, objUsuario.getApellido());
            ps.setString(6, objUsuario.getCorreo());
            ps.setInt(7, objUsuario.getEdad());
            ps.setInt(8, objUsuario.getCodigoPerfil());
            java.sql.Date fechaSql=new java.sql.Date(objUsuario.getFechaNacimiento().getTime());
            ps.setDate(9, fechaSql);
            if(ps.executeUpdate()==1){
                System.out.println("Usuario registrado exitosamente");
                return true;
            }else{
                System.out.println("Error en el ingreso del usuario");
            }   
            
        } catch (Exception e) {
            System.out.println("Error en el guardado del usuario "+e);
        }
        
        return false;
    }

    @Override
    public List readElementos() {
        List<Usuario>listadoUsuarios=new LinkedList<>();
        Usuario objUsuario;
        try {
            Connection con=Conexion.getConexion();
            String query="select * from usuario";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                objUsuario=new Usuario(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getDate(9));
                listadoUsuarios.add(objUsuario);
            }
        } catch (Exception e) {
            System.out.println("Error en la obtención de los datos");
        }
        
        return listadoUsuarios;
    }

    @Override
    public boolean updateElemento(Object objetoUpdate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteElemento(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int idUsuario() {
        int id=0;
        try {
            Connection con=Conexion.getConexion();
            String query="select max(id_usuario) from usuario";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                id=rs.getInt(1);
                return id+1;
            }
        } catch (Exception e) {
            System.out.println("Error en la obtención de ID usuario más grande");
        }
        return id;
    }
    
    public boolean validarUsuario(String username,String password){
        try {
            Connection con=Conexion.getConexion();
            String query="select login_usuario from usuario where login_usuario=? and pass_usuario=?";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            if(rs.first()){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
}
