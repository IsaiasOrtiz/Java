/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elcon
 */
public class ClasesDeJava {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        //Agrego comentario
        String cadena="En general, se puede formular un ácido graso genérico como R-COOH, donde R es la cadena hidrocarbonada que identifica al ácido en particular";
        System.out.println("Longitud: "+cadena.length());
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());
        String fecha;
        fecha = cadena.substring(0, 10);
        System.out.println("fecha = " + fecha);
        Date fecha1;
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/yyyy");
        String fe="17/07/1997".concat("DD");
        try {
            fecha1=formatoFecha.parse(fe);
            System.out.println("fe = " + fe);
        } catch (ParseException ex) {
            Logger.getLogger(ClasesDeJava.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
        
                
    }
}
