/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author andrea
 */
public class Venta {
    private String id;
    private GregorianCalendar fecha;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private double subtotal;
    private double iva;
    private double total;

    public Venta(String id, Cliente cliente) {
        this.id = id;
        this.fecha = new GregorianCalendar();
        this.cliente = cliente;
        this.productos = new ArrayList<Producto>();
        this.subtotal = 0;
        this.iva = 0;
        this.total=0;
    }

    public String obtenerId() {
        return id;
    }

    public GregorianCalendar obtenerFecha() {
        return fecha;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public ArrayList<Producto> obtenerProductos() {
        return productos;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerTotal() {
        return total;
    }

    public void establecerFecha() {
        this.fecha = new GregorianCalendar();
    }

    public void establecerCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void establecerSubtotal() {
        this.subtotal = ;
    }

    public void establecerIva() {
        this.iva = ;
    }

    public void establecerTotal() {
        this.total = this.subtotal + this.iva;
    }
    
    
    
    
    
}
