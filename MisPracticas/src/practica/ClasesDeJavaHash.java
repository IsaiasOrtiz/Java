/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author elcon
 */
public class ClasesDeJavaHash {
   Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Hashtable<String, Short> hash = new Hashtable();
        Map<Integer, String> map = new HashMap();

        hash.put("00f", (short) 1);
        hash.put("01f", (short) 23);
        hash.put("02f", (short) 13);
        hash.put("03f", (short) 13);
        //Obtener un valor por su llave
        System.out.println("El numero del codigo 01f es :" + hash.get("02f"));

        //
        Enumeration element = hash.keys();
        while (element.hasMoreElements()) {

            String llave = String.valueOf(element.nextElement());
            System.out.println("Llave: " + llave + " Valor[" + llave + "]");
        }
        
        map.put(12,"Pablo" );
        map.put(13,"Manuel" );
        map.put(14,"Jose" );
        System.out.println("_____________Parte 2________________");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"  :  "+entry.getValue());
            
        }
        Properties properties=new Properties();
        properties.put("mensajeBienvenida_ES","Bienvenidos estudiantes");
        properties.put("mensajeBienvenida_EN","Welcome studens");
        System.out.println("Seleccione el lenguaje");
        System.out.println("1-español");
        System.out.println("2-ingles");
        Scanner sca=new Scanner(System.in);
                
    }

}
