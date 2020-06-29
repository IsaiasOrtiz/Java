/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 *
 * @author elcon
 */
public class Encriptacion {
    public static void main(String[] args) {
        BasicTextEncryptor encriptador=new BasicTextEncryptor();
        String privateData="asd331223dfcae4456";
        encriptador.setPassword(privateData);
        String textoEncriptado=encriptador.encrypt("El Chele se la come");
        System.out.println(textoEncriptado);
        
        
        String textoDesencriptado=encriptador.decrypt(textoEncriptado);
        System.out.println("textoDesencriptado = " + textoDesencriptado);
        
                
    }
}
