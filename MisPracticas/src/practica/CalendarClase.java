/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author elcon
 */
public class CalendarClase {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Calendar gregro =new GregorianCalendar();                
      
        System.out.println(calendar.getTime().toString());
        System.out.println(gregro.getTime().toString());
        calendar.set(2020,Calendar.FEBRUARY,2);
        System.out.println(calendar.getTime().toString());
        calendar.add(Calendar.HOUR,12);
        System.out.println(calendar.getTime().toString());
    }
}
