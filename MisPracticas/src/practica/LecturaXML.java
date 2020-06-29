/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import com.bitlab.entidades.Plant;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.dom4j.Document;

import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 *
 * @author elcon
 */
public class LecturaXML {

    public static void main(String[] args) {
        List<Plant> planta = new ArrayList<Plant>();
        File archivo = new File("C:\\Users\\elcon\\Desktop\\bitlab\\plant_catalog.xml");
        try {
//            URL url = new URL("https://www.w3schools.com/xml/plant_catalog.xml");
            SAXReader reader = new SAXReader();

            Document document = reader.read(archivo);
            Element root = document.getRootElement();
            String empresa = document.selectSingleNode("//EMPRESA").getText();
            System.out.println("empresa = " + empresa);

            for (Element plantaElemento : root.elements()) {
                Plant pl = new Plant();
                if (plantaElemento.getName().equals("PLANT")) {
                    pl.setComom(plantaElemento.elementText("COMMON"));
                    pl.setBotanical(plantaElemento.elementText("BOTANICAL"));
                    pl.setZone(plantaElemento.elementText("ZONE"));
                    pl.setLight(plantaElemento.elementText("LIGHT"));
                    pl.setPrice((plantaElemento.elementText("PRICE").substring(1)));
                    pl.setAvailability(Integer.parseInt(plantaElemento.elementText("AVAILABILITY")));
                    planta.add(pl);
                } else {

                }

            }

            for (Plant pl : planta) {
                System.out.println("==============================");
                System.out.println("CAMMON:" + pl.getComom());
                System.out.println("BOTANICAL:" + pl.getBotanical());
                System.out.println("ZONE:" + pl.getZone());
                System.out.println("PRICE: $" + pl.getPrice());
                System.out.println("AVAILABILITY:" + pl.getAvailability());

            }

            System.out.println(empresa);

            System.out.println("=============NEW===========");
            Document document2 = DocumentHelper.createDocument();
            Element root2 = document2.addElement("root");

            Element author1 = root2.addElement("author")
                    .addAttribute("name", "James")
                    .addAttribute("location", "UK")
                    .addText("James Strachan");

            Element author2 = root2.addElement("author")
                    .addAttribute("name", "Bob")
                    .addAttribute("location", "US")
                    .addText("Bob McWhirter");
            
            System.out.println(document2.asXML());
            
            File xmlFile=new File("archivoXML.xml");
            FileWriter fw=new FileWriter(xmlFile);
            BufferedWriter bfw=new BufferedWriter(fw);
            PrintWriter pw1=new PrintWriter(bfw);
            pw1.print(String.valueOf(document2.asXML()));
            
            
           pw1.close();
           bfw.close();
           fw.close();
           
           
        } catch (DocumentException | IOException ex) {
            Logger.getLogger(LecturaXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
