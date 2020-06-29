/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Douglas we
 */
public class HilosPrueba implements Runnable
{

    @Override
    public void run() {
        try {
            System.out.println("Hola mundo desde nuestro hillo");
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HilosPrueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
