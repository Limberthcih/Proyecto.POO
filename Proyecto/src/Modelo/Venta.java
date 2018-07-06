/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Calendar;
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
        this.id = "V" + id;
        this.fecha = new GregorianCalendar();
        this.cliente = cliente;
        this.productos = new ArrayList<Producto>();
        this.subtotal = 0;
        this.iva = 0;
        this.total=0;
    }

    public Venta(String id, GregorianCalendar fecha, Cliente cliente, ArrayList<Producto> productos, double subtotal, double iva, double total) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = productos;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
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
        if(productos.size()>0){
            for(int i=0; i<productos.size(); i++){
                this.subtotal += productos.get(i).obtenerPrecioUnitario();
            }
        }          
    }

    public void establecerIva(){
        this.iva = this.subtotal * (0.16) ;
    }

    public void establecerTotal() {
        this.total = this.subtotal + this.iva;
    }
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    public int buscarProducto(String clave){
       int i;
       for(i=0; i<productos.size();i++){
           if(clave.equals(productos.get(i).obtenerClave())){
               break;
           }
       }
       if(i>=productos.size()){
           i=-1;
       }
       return i;
    }
    
    public void eliminarProducto(String clave){
        int i;
        i=this.buscarProducto(clave);
        if(i>-1){
            productos.remove(i);
        }
    }
   
    public String stringFecha(){
        String contenido;
        contenido= fecha.get(Calendar.DAY_OF_MONTH)+"/"+(fecha.get(Calendar.MONTH)+1)+"/"+fecha.get(Calendar.YEAR);
        return contenido;
    }
       
    public String stringProductos(){
       String cadenaProductos="";
       for(int i=0; i<productos.size(); i++){
           cadenaProductos= productos.get(i).toString()+",";
       }
       return cadenaProductos;
    }
    
    public String toString(){
        return id+","+this.stringFecha()+","+cliente.toString()+","+subtotal+","+iva+","+total+","+this.stringProductos();
    }
    
    
    /*public boolean equals(Object objeto){
        boolean bandera=false;
        if(objeto instanceof Venta){
            Venta otraVenta = (Venta)objeto;
            if(this.id==((Venta) objeto).id){
                bandera=true;
            }
        }
        return bandera;
    }*/
    
}
