package Controlador;

import Proyecto.Vista.Bajas;
import java.util.Scanner;

public class ControlBajaProducto{
    //Variables
    
     public void EliminarProducto(String nombre, String clave){
        ArrayList<String> buscador = new ArrayList<String>; //Se debe meter el id por aquí
        FileWriter fr = null;
        BufferedReader br = null;
        
        try{
            fr = new FileWriter(nombre);
            br = new BufferedWriter(fr);
            for(String clave:buscador){
                if(productos.clave!=clave){
                    bw.write(productos.clave + "\t"+productos.descripcion+ "\t"+ productos.preciounitario+ "\t"+ productos.cantidad+"\r\n");
                }else{
                    System.out.println("El producto ha sido eliminado");
                }
            }
            
            
        }catch(Exception e){
            System.out.println(ex.getMessage());  
        }finally{
            bw.close();
            buscador.clear();
        }
    }
    
    public void BusquedaProducto(String nombre, String id){
        ArrayList<String> buscador = new ArrayList<String>; 
        FileWriter fr = null;
        PrintWriter pw = null;
        
        try{
            fr = new FileWriter(nombre);
            br = new PrintdWriter(fr);
            for(String rfc:buscador){
                if(productos.clave==id){
                    pw.println(productos.clave + "\t"+productos.descripcion+ "\t"+ productos.preciounitario+ "\t"+ productos.cantidad+"\r\n");
                }
            }
            
            
        }catch(Exception e){
            System.out.println(ex.getMessage());  
        }finally{
            bw.close();
            //buscador.clear();
        }
    }
}
