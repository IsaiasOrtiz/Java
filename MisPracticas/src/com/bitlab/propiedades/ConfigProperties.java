/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitlab.propiedades;

import java.io.InputStream;

/**
 *
 * @author elcon
 */
public class ConfigProperties {

    public static InputStream getResourceAsImputStream(String name) {

        return ConfigProperties.class.getResourceAsStream(name);
    }
}
