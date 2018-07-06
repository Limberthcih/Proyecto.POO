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
public class Producto {
   private int clave;
   private String descripcion;
   private double precioUnitario;
   private int cantidad;

    public Producto(int Clave, String Descripcion, double PrecioUnitario, int Cantidad) {
        this.clave = Clave;
        this.descripcion = Descripcion;
        this.precioUnitario = PrecioUnitario;
        this.cantidad = Cantidad;
    }

    public int obtenerClave() {
        return clave;
    }

    public String obtenerDescripcion() {
        return descripcion;
    }

    public double obtenerPrecioUnitario() {
        return precioUnitario;
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    public void establecerDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public void establecerPrecioUnitario(double PrecioUnitario) {
        this.precioUnitario = PrecioUnitario;
    }

    public void establecerCantidad(int Cantidad) {
        this.cantidad = Cantidad;
    }
   
    public boolean equals(String otraDescripcion){
        boolean bandera=false;
        if(this.descripcion.equals(otraDescripcion)){
            bandera=true;
        }
        return bandera;
    }
   
    public String toString(){
        return clave+","+descripcion+","+cantidad+","+precioUnitario;
    }
}
