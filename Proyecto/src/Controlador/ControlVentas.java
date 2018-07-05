/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Venta;

/**
 *
 * @author andrea
 */
public class ControlVentas implements ControlAccionesAdicionales{
    private Venta venta;
    
    @Override
    public void Alta(){
        System.out.println(".");
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

}
