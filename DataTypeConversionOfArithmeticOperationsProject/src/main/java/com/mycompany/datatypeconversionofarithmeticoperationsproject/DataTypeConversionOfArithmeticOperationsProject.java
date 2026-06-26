/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datatypeconversionofarithmeticoperationsproject;

/**
 *
 * @author moka
 */
public class DataTypeConversionOfArithmeticOperationsProject{
    public static void main(String[] args){
        int a , b;
        a = 20;
        b = 30;
        float c = 40.3434f;
        double x = 56.2232323;
        System.out.println("The Sum Of A , And B Is = "+ (a + b)); // 50 (Integer).
        // The Sum Of A , And B Is Integer Data Type , Because The A , And B 
        // With The Same Data Type (Integer).
        System.out.println("The Sum Of A , B , And Finally C Is = "
        + (a + b + c)); // 80.3434 (Float).
        // The Sum Of A , B , And C Is Float Data Type , Because The A , B Is 
        // Integer Data Type , And Also It Contains Only One Operand C Is Float
        // Data Type Without Using Any Operand With Double Data Type.
        System.out.println("The Sum Of A , B , C , And Finally "
        + "X Is = "+ (a + b + c + x)); // 146.5666323 (Double).
        // The Sum Of A , B , C , And x Is A Double Data Type.
        // Because A , B Is An Integer Data Type.
        // And C Is A Float Data Type.
        // And Finally D Is A Double Data Type.
    }
}