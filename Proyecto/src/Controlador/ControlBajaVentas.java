package Controlador;
import java.util.ArrayList;
import Proyecto.Vista.Bajas;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ControlBajaVentas{
    //Variables
    //https://mega.nz/#!gw4TEbLS!dpHMlvc380rq4hngAOkHlSX9dZOI3iQHlYQCiL6I9io
    public void EliminarVenta(String nombre, String clave){
        ArrayList<String> buscador = new ArrayList<String>; //Se debe meter el id por aquí
        FileWriter fr = null;
        BufferedReader br = null;
        
        try{
            fr = new FileWriter(nombre);
            br = new BufferedWriter(fr);
            for(String clave:buscador){
                if(venta.id!=clave){
                    bw.write(venta.id + "\t"+venta.fecha+ "\t"+ venta.cliente/*cliente.nombre*/+ "/t" +venta.total+ "\r\n");
                }else{
                    System.out.println("La venta ha sido eliminada");
                }
            }
            
            
        }catch(Exception e){
            System.out.println(ex.getMessage());  
        }finally{
            br.close();
            buscador.clear();
        }
    }
    
    public void BusquedaVenta(String nombre, String id){
        ArrayList<String> buscador = new ArrayList<String>; 
        FileWriter fr = null;
        PrintWriter pw = null;
        
        try{
            fr = new FileWriter(nombre);
            br = new PrintdWriter(fr);
            for(String id:buscador){
                if(venta.id==id){
                    pw.println(venta.id + "\t"+venta.fecha+ "\t"+ venta.cliente/*cliente.nombre*/+ "/t" +venta.total+ "\r\n");
                    //¿Se pedirá más informació?
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

