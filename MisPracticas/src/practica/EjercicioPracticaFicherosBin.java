/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import com.bitlab.entidades.Auto;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elcon
 */
public class EjercicioPracticaFicherosBin {
private static final String ARCHIVO="practica.ddr";
private static List<Auto> auto=new ArrayList<>();
    public static void main(String[] args) {
        StringBuilder datos = new StringBuilder();
        Auto au=new Auto();
        Scanner sc = new Scanner(System.in);
    try {
        FileInputStream archivo1=new FileInputStream(ARCHIVO);
        DataInputStream binD=new DataInputStream(archivo1);
        String dat;
//        while((dat=binD.readLine())!=null)
//        {
//            au.setMatricula(binD.readUTF().toString());
//            au.setMarca(binD.readUTF().toString());
//            au.setTamaño(binD.readDouble());
//            au.setModelo(binD.readUTF().toString());
//        }
        au.toString();
        
        
    } catch (FileNotFoundException ex) {
        Logger.getLogger(EjercicioPracticaFicherosBin.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(EjercicioPracticaFicherosBin.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        try {
           
            FileOutputStream archivo = new FileOutputStream(ARCHIVO);
            try (DataOutputStream bin2 = new DataOutputStream(archivo);) {
                System.out.println("Ingrese la Matricula");
                bin2.writeUTF(sc.nextLine());
                System.out.println("Ingrese la Marca");
                bin2.writeUTF(sc.nextLine());
                System.out.println("Ingrese el tamaño del deposito");
                bin2.writeDouble(Double.parseDouble(sc.nextLine()));
                System.out.println("Ingrese el modelo");
                bin2.writeUTF(sc.nextLine());
                
            }

        } catch (FileNotFoundException e) {
        } catch (IOException ex) {
            Logger.getLogger(EjercicioPracticaFicherosBin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
