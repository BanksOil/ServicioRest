/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author BanksOil
 */
public class Validaciones {
    public boolean validarMonth (String cadena) {
        boolean val = false;
        if(Integer.parseInt(cadena) <= 12 && Integer.parseInt(cadena) > 0) {
            val = true;
            return val;
        }
        return val;
    }
    
    public boolean validarGasType (String cadena) {
        boolean val = false;
        if(Integer.parseInt(cadena) == 1 || Integer.parseInt(cadena) == 2) {
            val = true;
            return val;
        } else {
           System.out.println("Gas Type no valido");
           return val; 
        }
    }
    
    public boolean validarLenghtcard (String cadena) {
        boolean val = false;
        if(cadena.length() == 16) {
            val = true;
            return val;
        } else {
           System.out.println("Card Number no valido");
           return val; 
        }
    }
    
    private static boolean isNumeric(String cadena){
	try {
            Integer.parseInt(cadena);
            return true;
	} catch (NumberFormatException nfe){
            return false;
	}
    }
    
    public static boolean ValidarMail(String email) {
        // Patron para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }
}
