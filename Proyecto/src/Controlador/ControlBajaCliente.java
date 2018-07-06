package Controlador;

import Vista.Bajas;
import java.util.*;
import java.io.*;

public class ControlBajaCliente{
    //Variables
    
    public void EliminarCliente(String nombre, String rfc){
        ArrayList<String> buscador = new ArrayList<String>(); 
        FileWriter fr = null;
        BufferedWriter br = null;
        File f;
        f=new File(nombre);
        try{
            fr = new FileWriter(f);
           br = new BufferedWriter(fr);
            for(String rfc:buscador){
                if(clientes.rfc!=rfc){
                    bw.write(clientes.rfc + "\t"+clientes.nombre+ "\t"+ clientes.dirección+ "\t"+ clientes.telefono+"\r\n");
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
    
    public void BusquedaCliente(String nombre, String rfc){
        ArrayList<String> buscador = new ArrayList<String>(); 
        FileWriter fr = null;
        PrintWriter pw = null;
        
        try{
            fr = new FileWriter(nombre);
            pw = new PrintWriter(fr);
            for(String rfc:buscador){
                if(clientes.rfc==rfc){
                    pw.println(clientes.rfc + "\t"+clientes.nombre+ "\t"+ clientes.dirección+ "\t"+ clientes.telefono+"\r\n");
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
