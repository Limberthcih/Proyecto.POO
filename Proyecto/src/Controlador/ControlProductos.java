/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Producto;

/**
 *
 * @author andrea
 */
public class ControlProductos implements ControlAccionesAdicionales{
    private Producto producto;
    
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
