/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Modelo;

/**
 *
 * @author andrea
 */
public class Cliente {
    private String rfc;
    private String razonSocial;
    private String direccion;
    private String telefono;

    public Cliente(int rfc ,String RazonSocial, String Direccion, String Telefono) {
        this.rfc = "C" + rfc;
        this.razonSocial = RazonSocial;
        this.direccion = Direccion;
        this.telefono=Telefono;
    }

    public String obtenerRfc() {
        return rfc;
    }

    public String obtenerRazonSocial() {
        return razonSocial;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public String obtenerTelefono() {
        return telefono;
    }

    public void establecerRazonSocial(String RazonSocial) {
        this.razonSocial = RazonSocial;
    }

    public void establecerDireccion(String Direccion) {
        this.direccion = Direccion;
    }

    public void establecerTelefono(String Telefono) {
        this.telefono = Telefono;
    }
    
    
}
