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
public class TipoUsuario {
    private final Permiso moduloVenta;
    private final Permiso moduloClientes;
    private final Permiso moduloProductos;
    private final Permiso moduloUsuario;
    
    public TipoUsuario(String tipoUsuario){
        if(tipoUsuario.equals("Administrador")){
            this.moduloClientes= new Permiso(true,true,true,true);
            this.moduloProductos= new Permiso(true,true,true,true);
            this.moduloUsuario= new Permiso(true,true,false,false);
            this.moduloVenta= new Permiso(true,true,true,true);
        }
        else{
            this.moduloClientes= new Permiso(true,false,false,true);
            this.moduloProductos= new Permiso(false,false,false,true);
            this.moduloUsuario= new Permiso(false,false,false,false);
            this.moduloVenta= new Permiso(true,false,false,true);
        }
    }
    
    
    public Permiso obtenerModuloVenta() {
        return moduloVenta;
    }

    public Permiso obtenerModuloClientes() {
        return moduloClientes;
    }

    public Permiso obtenerModuloProductos() {
        return moduloProductos;
    }

    public Permiso obtenerModuloUsuario() {
        return moduloUsuario;
    }
    
    
}
