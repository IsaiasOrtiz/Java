/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import com.bitlab.propiedades.ConfigProperties;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elcon
 */
public class CargarPropiedades {
    private static final String LENGUAJE="lenguaje_@seleccion.properties";
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            Properties pro=new Properties();
            Properties proLenguaje=new Properties();
            
            String fileLoad="config.properties";
            
            pro.load(ConfigProperties.getResourceAsImputStream(fileLoad));
            
            System.out.println(pro.get("nombreAplicacion"));
            System.out.println(pro.get("lenguaje"));
            
            System.out.println("Seleccione el idioma ES-ESPAÑOL \n EN-Ingles");
            
            String opcion=sc.nextLine();
          
               //opcion = opcion.substring(0, 1).toUpperCase();
               proLenguaje.load(ConfigProperties.getResourceAsImputStream(LENGUAJE.replace("@seleccion", opcion)));
            
            System.out.println(proLenguaje.getProperty("msjBienvenida"));
        } catch (IOException ex) {
            Logger.getLogger(CargarPropiedades.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
