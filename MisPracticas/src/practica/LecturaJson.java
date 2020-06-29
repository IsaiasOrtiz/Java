/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import com.bitlab.entidades.CatalogoPlantas;
import com.bitlab.entidades.Plant;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elcon
 */
public class LecturaJson {
   
    public static void main(String[] args) {
        try {
            ObjectMapper maper=new ObjectMapper();
            File jsonArchivo=new File("C:\\Users\\elcon\\Desktop\\bitlab\\plant_catalog.json");
            CatalogoPlantas catalogo= maper.readValue(jsonArchivo, CatalogoPlantas.class);
            
            for(Plant p:catalogo.getPlant())
            {
                System.out.println(p.toString());
            }
            
            ObjectNode node=(ObjectNode) maper.readTree(jsonArchivo);
            
            for (JsonNode jsonNode : node.findPath("PLANT")) {
                System.out.println("Nodo:"+jsonNode.findValue("COMMON").asText());
            }
        } catch (IOException ex) {
            Logger.getLogger(LecturaJson.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       
    }
}
