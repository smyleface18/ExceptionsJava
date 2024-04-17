/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exception;


/**
 *
 * @author SCIS2-10
 */
public class Exceptions {

    public static void main(String[] args)  {
        
        Calculator calculator = new Calculator();
        


        try{
                double result = calculator.division(2, 0);
                System.out.println("result: "+result);
        }
        catch(Exception exception){
            System.out.println("OPERATION ILLEGAL");
            System.out.println(exception.getMessage());
            
        }

    }
    

}
