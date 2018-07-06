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
public class Usuario {
    private TipoUsuario rol;
    private final String nombre;
    private final String contrasena;
    
    public Usuario(String tipoUsuario,String nombre, String contrasena){
        this.nombre=nombre;
        this.contrasena=contrasena;
        this.rol= new TipoUsuario(tipoUsuario);
    }
    
    public TipoUsuario obtenerRol() {
        return rol;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerContrasena() {
        return  contrasena;
    }
    
    public boolean equals(String otroNombre){
        boolean bandera=false;
        if(this.nombre.equals(otroNombre)){
            bandera=true;
        }
        return bandera;
    }
    
    public String toString(){
        return nombre+","+contrasena;
    }
    
    
}
