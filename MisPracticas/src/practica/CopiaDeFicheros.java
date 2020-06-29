/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elcon
 */
public class CopiaDeFicheros {

    public static void main(String[] args) {
        
        try {
           
            StringBuilder concatenados=new StringBuilder();
            File ficheroLectura = new File("fichero1.txt");
            FileReader fl = new FileReader(ficheroLectura);
            BufferedReader bfr = new BufferedReader(fl);
            String linea;
            while ((linea = bfr.readLine()) != null) {
                System.out.println(linea);
                concatenados.append(linea).append("\n");
            }
            ficheroLectura=new File("fichero2.txt");
            fl=new FileReader(ficheroLectura);
            bfr=new BufferedReader(fl);
             while ((linea = bfr.readLine()) != null) {
                System.out.println(linea);
                concatenados.append(linea).append("\n");
            }
            bfr.close();
            fl.close();
            
             
            StringBuilder strB = new StringBuilder();
            File fichero1 = new File("Concatenado.txt");
            FileWriter ficheroEscribir = new FileWriter(fichero1);
            BufferedWriter bf = new BufferedWriter(ficheroEscribir);
            PrintWriter pt = new PrintWriter(bf);
            
            
            pt.write(concatenados.toString());
            pt.close();
            bf.close();
             
            

        } catch (IOException ex) {
            Logger.getLogger(CopiaDeFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
