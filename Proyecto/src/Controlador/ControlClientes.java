/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.AltaCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Cliente;
import Vista.ControlAccionesEntidades;

/**
 *
 * @author andrea
 */
public class ControlClientes implements ControlAccionesAdicionales{
    private Cliente cliente;
    private ControlAccionesEntidades vista;
    
    ControlClientes(int rfc, String claveVentana){
        this.cliente= new Cliente(rfc, "","","");
        this.vista= new ControlAccionesEntidades();
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
                System.exit(0);
                AltaCliente vista= new AltaCliente();
                cliente.establecerRazonSocial(vista.obtenerRazon());
                cliente.establecerDireccion(vista.obtenerDireccion());
                cliente.establecerTelefono(vista.obtenerTel());
                //comparacion razonsocial con archivos
                //escritura en el archivo
            }catch(Exception excep){
            }
            
        }

    }
    
    
    
    
}
