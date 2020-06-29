/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elcon
 */
public class FicherosBinarios {

    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("datosBin.ddr");
            try (DataOutputStream bin = new DataOutputStream(file);) {
                bin.writeInt(2);
                bin.writeUTF("Douglas");
                bin.writeDouble(10.6);
            } catch (Exception e) {
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FicherosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileInputStream file2=new FileInputStream("datosBin.ddr");
            try(DataInputStream bin=new DataInputStream(file2);)
            {
                System.out.println(bin.readInt());
                System.out.println(bin.readUTF());
                System.out.println(bin.readDouble());
            }catch(FileNotFoundException e){} catch (IOException ex) {
                Logger.getLogger(FicherosBinarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FicherosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
}
