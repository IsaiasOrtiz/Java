/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.entidades;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author elcon
 */
public class Plant {
    
    @JsonProperty("COMMON")
    private String comom;
    
    @JsonProperty("BOTANICAL")
    private String botanical;
    
    @JsonProperty("ZONE")
    private String zone;
    
    @JsonProperty("LIGHT")
    private String light;
    
    @JsonProperty("PRICE")
    private String price;
    
    @JsonProperty("AVAILABILITY")
    private int availability;

    public Plant(String comom, String botanical, String zone, String light, String price, int availability) {
        this.comom = comom;
        this.botanical = botanical;
        this.zone = zone;
        this.light = light;
        this.price = price;
        this.availability = availability;
    }

    public Plant() {
    }
    

    public String getComom() {
        return comom;
    }

    public void setComom(String comom) {
        this.comom = comom;
    }

    public String getBotanical() {
        return botanical;
    }

    public void setBotanical(String botanical) {
        this.botanical = botanical;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Plant{" + "comom=" + comom + ", botanical=" + botanical + ", zone=" + zone + ", light=" + light + ", price=" + price + ", availability=" + availability + '}';
    }
    

}
