/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import com.bitlab.hilos.HilosPrueba;
import java.util.Scanner;

/**
 *
 * @author elcon
 */
public class Hilos 
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        boolean flag=true;
        while (flag) {  
        System.out.println("Ingrese el 1 si quiere un nuevo hilo");
        byte b=sc.nextByte();  
        if(b==1)
        {
        HilosPrueba hilos=new HilosPrueba();
        Thread hilo=new Thread(hilos);
        hilo.setName("Hilo");
        hilo.start();
        }else{
        flag=false;
        }
        
        }
        
    }
    
}
