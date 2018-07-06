package Controlador;

import java.io.*;
import java.util.ArrayList;


public class LecturaArchivo{
    private String Archivo;
    private ArrayList<String> ed;
    
    public LecturaArchivo(String arch){
        this.Archivo=arch;
        this.ed= new ArrayList<String>();
    }
    
    public void LeerArchivo(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
     
 
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
	// hacer una lectura comoda (disponer del metodo readLine()).
            String temp="src\\Archivos-Entidades\\"+Archivo;
            archivo = new File(temp);
	    fr = new FileReader(archivo);
	    br = new BufferedReader(fr);
 	// Lectura del fichero
            String temporal;
           
            temporal=br.readLine();
            
            while(temporal!=null){
	  	ed.add(temporal);
                
                temporal=br.readLine();
                
            }
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
     
    
    }
    
    public boolean compararIdentificadoresString(String arch, String vista){
        boolean bandera=false;
        String[] arreglo=arch.split(",");
        if(arreglo[0].equals(vista)){
            bandera= true;
        }
        return bandera;
    }
    
    public int busquedaDatosEnArchivo(String clave){
        int i;
        LeerArchivo();
        for(i=0; i<ed.size(); i++){
            if(compararIdentificadoresString(ed.get(i), clave)){
                break;
            }
        }
        return i;
    }
    
    public boolean verificarNoRepeticion(String noRepetir){
        boolean bandera=false;
        int i;
        LeerArchivo();
        for(i=0; i<ed.size(); i++){
            String temporal=ed.get(i);
            String[] arreglo= temporal.split(",");
            if(arreglo[1].equals(noRepetir)){
                bandera=true;
                break;
            }
        }
        return bandera;
    }
    
    public void EscrituraArchivo(ArrayList<String> Arch, boolean tipoEscritura){
        //System.out.println(Archivo);
        FileWriter fichero = null;
        PrintWriter pw = null;
        //Arch= Arch+"\n";
        String temp="src\\Archivos-Entidades\\"+Archivo;
        try
        {
            fichero = new FileWriter(temp,tipoEscritura);
            //br = new BufferedWriter(fichero);

            pw = new PrintWriter(fichero);
 
            //System.out.println("Escribiendo en el archivo.txt");
            for(int i=0; i<Arch.size(); i++){
                pw.println(Arch.get(i));
            }
            
            //pw.write(Arch);
           // fichero.write(Arch);
         } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
    	 // Nuevamente aprovechamos el finally para 
        // asegurarnos que se cierra el fichero.
            if (null != fichero)
        	fichero.close();
                //pw.close();
                
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    
    
    public static void main(String ar[]){
        
        LecturaArchivo arch= new LecturaArchivo("archivo.txt");
        arch.LeerArchivo();
        System.out.println(arch.ed);
        System.out.println(arch.Archivo);
        ArrayList<String> ed;
        ed =new ArrayList<String>();
        ed.add("hola");
        ed.add("queso");
        
        //System.out.println(arch.ed.get(2));
        arch.EscrituraArchivo(ed, true);
        
        System.out.println(arch.ed);
    }
    
}