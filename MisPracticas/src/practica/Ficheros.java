/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Douglas Isaias Valle Ortiz
 * Manejo de ficheros
 */
public class Ficheros {
    public static void main(String[] args) {
        try{
            String[] numeros={"1","3","sdf","ds3ññññ","dcasfdad"};
            FileWriter archivo=null;
            try{
                
                archivo=new FileWriter("ficheroPueba.txt");
                for(String str : numeros)
                {
                    
                    archivo.write("Caracter "+str+"\n");
                }
                archivo.close();
            }
            catch(IOException e)
            {}
            
            
            
            Writer salida=null;
            
            salida=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("ficheroPueba2.txt"),"UTF-8"));
            
            for(String str: numeros)
            {
                salida.write(str+"\n");
            }
            
        }
        catch(UnsupportedEncodingException ex)
        {   Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
}       catch (FileNotFoundException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
       File elFichero=null;
       elFichero=new File("ficheroPueba.txt");
       Scanner s=null;
        try {
            s= new Scanner(elFichero);
            while(s.hasNextLine())
            {
                System.out.println(s.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }
       
             
    }
}
