/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.entidades;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author elcon
 */
public class CatalogoPlantas {
    @JsonProperty("PLANT")
    private List<Plant> plant;
    
    @JsonProperty("EMPRESA")
    private String empresa;

    public List<Plant> getPlant() {
        return plant;
    }

    public void setPlant(List<Plant> plant) {
        this.plant = plant;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
}
