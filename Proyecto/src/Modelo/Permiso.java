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
public class Permiso {
    private final boolean permisoAlta;
    private final boolean permisoBaja;
    private final boolean permisoEdicion;
    private final boolean permisoConsulta;
    
    public Permiso(boolean alta, boolean baja, boolean edicion, boolean consulta){
        this.permisoAlta=alta;
        this.permisoBaja=baja;
        this.permisoEdicion=edicion;
        this.permisoConsulta= consulta;
    }

    public boolean obtenerPermisoAlta() {
        return permisoAlta;
    }

    public boolean obtenerPermisoBaja() {
        return permisoBaja;
    }

    public boolean obtenerPermisoEdicion() {
        return permisoEdicion;
    }

    public boolean obtenerPermisoConsulta() {
        return permisoConsulta;
    }
    
    
}
