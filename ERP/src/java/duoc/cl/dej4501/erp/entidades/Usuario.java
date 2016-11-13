/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.dej4501.erp.entidades;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author NicolasValenciaY
 */
public class Usuario implements Serializable{
   
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private int idUsuario;
    private String username;
    private String password;
    private String nombre;
    private String apellido;
    private String correo;
    private int edad;
    private int codigoPerfil;
    private Date fechaNacimiento;
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public Usuario(String username, String password, String nombre, String apellido, String correo, int edad, int codigoPerfil, Date fechaNacimiento) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.edad = edad;
        this.codigoPerfil = codigoPerfil;
        this.fechaNacimiento = fechaNacimiento;
    }
    
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Mutadores y accesadores">
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigoPerfil() {
        return codigoPerfil;
    }

    public void setCodigoPerfil(int codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
//</editor-fold>

}
