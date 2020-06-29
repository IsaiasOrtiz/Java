/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.io.IOException;

/**
 *
 * @author elcon
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // while
        int numero=1;
        while (numero <= 5) {
           String so= System.getProperty("os.name");
            System.out.println("so = " + so);
            System.out.println(numero);
            numero++;   
        }
        
       
        
                
    }

  
    
}
