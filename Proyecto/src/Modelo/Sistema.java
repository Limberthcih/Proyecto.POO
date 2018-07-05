/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author andrea
 */
public class Sistema {
    private Usuario usuario;
    
    public Sistema(String tipoUsuario,String nombre, String contrasena){
        this.usuario= new Usuario(tipoUsuario, nombre, contrasena);
    }

    public Usuario obtenerUsuario() {
        return usuario;
    }
    
}

