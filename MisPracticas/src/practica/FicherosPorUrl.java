/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Douglas Valle
 */
public class FicherosPorUrl {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader bufer = null;
        StringBuilder datos = new StringBuilder();
        try {
            //Definimos la url para la optencion de datos.
            System.out.println("Ingrese URL");
            String urlR=sc.nextLine();
            URL url = new URL(urlR);
            //Instanciamos el objeto donde tendremos el frujo de datos. url.openStream
            bufer = new BufferedReader(new InputStreamReader(url.openStream()));
            byte valor = 0;
            String valorFiltro = "";
            //Escribir

            String lineas;
            List<String> valores;
            boolean flag = true;
            while ((lineas = bufer.readLine()) != null) {
                valores = getTokenSplit(lineas);
                if (flag) {
                    for (short i = 0; i < valores.size(); i++) {
                        System.out.println(i + "-" + valores.get(i));
                    }
                    flag = false;
                    System.out.println("Seleccione el encabezado que quiere almacenar:");
                    valor = Byte.parseByte(sc.nextLine());
                    System.out.println("Seleccione el valor que decea filtar del " + valores.get(valor));
                    valorFiltro=sc.nextLine();
                }
                if (valorFiltro.equalsIgnoreCase(valores.get(valor))) {
                     datos.append(valores).append("\n");
                }

               
            }

            System.out.println(datos);

            bufer.close();
            System.out.println("Indique el directorio");
            File directorio;
            
            String directorioG=sc.nextLine();
            if (!directorioG.isEmpty()) {
                directorio=new File(directorioG);
                if (!directorio.isDirectory()) {
                    System.out.println("No es un directorio valido...");
                    System.exit(0);
                }
            }else {
            directorioG="";
            }
            System.out.println("Ingrese el nombre del archivo:");
            String nombre=sc.nextLine();
            File file= new File(directorioG+"\\"+nombre);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bfw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bfw);
            pw.write(datos.toString());
            System.out.println(System.currentTimeMillis());

            if (!(null == pw)) {
                pw.close();
            }
            if ((null == bfw)) {
                bfw.close();
            }
            if (!(fw == null)) {
                fw.close();
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(FicherosPorUrl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FicherosPorUrl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<String> getTokenSplit(String str) {
        List<String> tokens;
        tokens = Arrays.asList(str.split("\\,"));

        return tokens;
    }
}
