/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.dej4501.erp.entidades;

import java.io.Serializable;

/**
 *
 * @author NicolasValenciaY
 */
public class Perfil implements Serializable{
    private int codigoPerfil;
    private String descripcion;

    public Perfil(String descripcion) {
        this.descripcion = descripcion;
    }

    public Perfil(int codigoPerfil, String descripcion) {
        this.codigoPerfil = codigoPerfil;
        this.descripcion = descripcion;
    }
    

    public int getCodigoPerfil() {
        return codigoPerfil;
    }

    public void setCodigoPerfil(int codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
     
}
