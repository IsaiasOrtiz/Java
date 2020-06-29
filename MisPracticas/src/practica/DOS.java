/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static practica.FicherosPorUrl.getTokenSplit;

/**
 *
 * @author elcon
 */
public class DOS {

    public static void main(String[] args) {

        try {
            while (true) {
                Scanner sc = new Scanner(System.in);
                BufferedReader bufer = null;
                StringBuilder datos = new StringBuilder();
                URL url = new URL("http://salonv.utecvirtual.edu.sv/");
                //Instanciamos el objeto donde tendremos el frujo de datos. url.openStream
                bufer = new BufferedReader(new InputStreamReader(url.openStream()));
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(DOS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
