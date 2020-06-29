/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.entidades;

/**
 *
 * @author elcon
 */
public class Auto {
    private String matricula;
    private String marca;
    private double tamaño;
    private String modelo;

    @Override
    public String toString() {
        return "Auto{" + "matricula=" + matricula + ", marca=" + marca + ", tama\u00f1o=" + tamaño + ", modelo=" + modelo + '}';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
            
   
}
