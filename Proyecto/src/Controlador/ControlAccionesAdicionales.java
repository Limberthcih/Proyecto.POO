/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author 1047470
 */
public interface ControlAccionesAdicionales extends ControlAccionesGenerales{
    public void  Editar();
    public void Consultar();
    @Override
    public void Alta();
   
    @Override
    public void Baja();
}
