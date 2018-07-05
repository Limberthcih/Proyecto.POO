/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.AltaCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import Modelo.Cliente;
import Vista.Altas;

/**
 *
 * @author andrea
 */
public class ControlClientes implements ControlAccionesAdicionales{
    private Cliente cliente;
    private Altas vista;
    
    ControlClientes(int rfc, String claveVentana){
        this.cliente= new Cliente(rfc, "","","");
        this.vista= new Altas();
    }

      
    @Override
    public void Alta(){
    }
    
    @Override
    public void Baja(){
        System.out.println(".");
    }
   
    @Override
    public void Editar() {
        System.out.println(".");    
    }

    @Override
    public void Consultar() {
         System.out.println(".");    
    }

    
    
    
    
    private class  altaCliente implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent evento) {
            try{
                cliente.establecerRazonSocial(vista.obtenerTextoCajaRazonSocial());
                cliente.establecerDireccion(vista.obtenerTextoCajaDireccion());
                cliente.establecerTelefono(vista.obtenerTextoCajaTelefono());
                //comparacion razonsocial con archivos
                //escritura en el archivo
            }catch(Exception excep){
            }
            
        }

    }
    
    
    
    
}
