package Controlador;

import Proyecto.Vista.Bajas;
import java.util.Scanner;

public class ControlBajaUsuario{
        //Variiables
        //https://www.youtube.com/watch?v=8_N1WUepK_U
        
        public void EliminarUsuario(String nombre, String clave){
        ArrayList<String> buscador = new ArrayList<String>; //Se debe meter el id por aquí
        FileWriter fr = null;
        BufferedReader br = null;
        
        try{
            fr = new FileWriter(nombre);
            br = new BufferedWriter(fr);
            for(String clave:buscador){
                if(usuario.nombre!=clave){
                    bw.write(usuario.nombre + "\t"+usuario.contraseña + "\t"+ usuario.rol+ "\r\n");
                }else{
                    System.out.println("El usuario ha sido eliminado");
                }
            }
            
            
        }catch(Exception e){
            System.out.println(ex.getMessage());  
        }finally{
            bw.close();
            buscador.clear();
        }
    }
    
    public void BusquedaUsuario(String nombre, String id){
        ArrayList<String> buscador = new ArrayList<String>; 
        FileWriter fr = null;
        PrintWriter pw = null;
        
        try{
            fr = new FileWriter(nombre);
            br = new PrintdWriter(fr);
            for(String rfc:buscador){
                if(usuario.nombre==id){
                    pw.println(usuario.nombre + "\t"+usuario.contraseña + "\t"+ usuario.rol+ "\r\n");
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

