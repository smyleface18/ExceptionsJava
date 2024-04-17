/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exception;
/**
 *
 * @author SCIS2-10
 */
public class Calculator {

    public Calculator() {
    }
    
    
    
    
    public double division(double a, double b) throws Exception {
        
        if( b != 0){
                return a/b;
        }

       throw new Exception("no es posible dividir entre 0");
    }
}
