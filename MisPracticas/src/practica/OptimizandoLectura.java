/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elcon
 */
public class OptimizandoLectura {

    public static void main(String[] args) {
        URL urlObject;
        try {
            urlObject = new URL("http://www.datos.gob.sv/datastore/dump/fdf77d49-7ce0-4f5a-87a2-412d66e9db95?bom=True");

            URLConnection urlConnection = urlObject.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            BufferedReader bf=new BufferedReader(new InputStreamReader(inputStream));
            String datos;
           
            
           // System.out.println(data);
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(OptimizandoLectura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OptimizandoLectura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
            br.close();
        }
        return resultStringBuilder.toString();
    }
      public static List<String> getTokenSplit(String str)
    {
        List<String> tokens;
        tokens=Arrays.asList(str.split("\\,"));
        
        return tokens;
    }
}
