/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Calendar;
import java.util.GregorianCalendar;
import Modelo.Cliente;

/**
 *
 * @author limberth
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar c2 = new GregorianCalendar();
        System.out.println(c2);
       // System.out.println(c2.getTime());
        String hi=c2.get(Calendar.YEAR)+"/"+(c2.get(Calendar.MONTH)+1)+"/"+c2.get(Calendar.DAY_OF_MONTH);
       // System.out.println(hi);
        //System.out.println(c2.toString());
        Cliente cl=new Cliente(2,"aska","asds","asdasd");
        
    }
    
}
