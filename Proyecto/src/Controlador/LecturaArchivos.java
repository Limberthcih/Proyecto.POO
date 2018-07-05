package Controlador

import java.io.*;
import java.util.ArrayList;


public class LecturaArchivo{
    private String Archivo;
    private ArrayList<String> ed;
    
    public ArrayList<Archivo> LeerArchivo(String nombre){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
 
        try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File (nombre);
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
 
			// Lectura del fichero
			while((Archivo=br.readLine())!=null)
				System.out.println(Archivo);
        }
        catch(Exception e){
           e.printStackTrace();
        }finally{
           // En el finally cerramos el fichero, para asegurarnos
           // que se cierra tanto si todo va bien como si salta 
           // una excepcion.
           try{
              if( null != fr ){
                 fr.close();
              }
           }catch (Exception e2){
              e2.printStackTrace();
           }
        }    
        return ed;
    }
    
    
    public void EscrituraArchivo(String Archivo){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
        	fichero = new FileWriter("archivo.txt");
           	pw = new PrintWriter(fichero);
 
           	System.out.println("Escribiendo en el archivo");
           	pw.println(Archivo);
 
        } catch (Exception e) {
        	e.printStackTrace();
        } finally {
        	try {
    			// Nuevamente aprovechamos el finally para 
        		// asegurarnos que se cierra el fichero.
        		if (null != fichero)
        			fichero.close();
        	} catch (Exception e2) {
        		e2.printStackTrace();
        	}
        }
    }
    
}
