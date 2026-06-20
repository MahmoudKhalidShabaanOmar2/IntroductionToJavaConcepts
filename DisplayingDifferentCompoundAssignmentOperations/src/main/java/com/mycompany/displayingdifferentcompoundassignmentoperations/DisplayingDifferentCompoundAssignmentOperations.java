/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingdifferentcompoundassignmentoperations;

/**
 *
 * @author moka
 */
public class DisplayingDifferentCompoundAssignmentOperations {

    public static void main(String[] args) {
        int x = 10;
        System.out.printf("The X Is = %d%n", x);
        System.out.println("The Prefix Increment , And Postfix "
        + "Incremented Of The Variable Is : ");
        ++x; // x = x + 1 = 10 + 1 = 11; Incremented The Variable Before 
        // Executing , Or Running The Statement.
        System.out.printf("The Prefix Incremented Of X Is = %d%n", x);
        x++; // X = X + 1 = 11 + 1 = 12; Incremented The Variable After 
        // Executing , Or Running The Statement.
        System.out.printf("The Postfix Incremented Of x Is = %d%n", x);
        System.out.printf("The Prefix Incremented Of X Again "
        + "Is = %d%n", ++x); // Incremented X Prefix , Before Executing , Or 
        // Running The Statement. => x = x + 1 = 12 + 1 = 13.
        System.out.printf("The Postfix Incremented Of X Again "
        + "Is = %d%n", x++); // 13 Incremented X Postfix After Executing , Or 
        // Running The Statement. => X = X + 1 = 13 + 1 = 14 , 14 Stores In The 
        // Memory Not Appears For The User Of Your Own Java Computer Programming Codes.
        System.out.printf("The Value Of X Is = %d%n", x); // 14 That Stored In The 
        // Memory From The Last Step.
        int y = 20;
        System.out.printf("The Y Is = %d%n", y);
        System.out.print("\nThe Prefix Decremented , And Postfix Decremented Is : \n");
        y--; // Y = Y - 1 = 20 - 1 =19 , Decremented The Variable By One After Executing , 
        // Or Running The Statement.
        System.out.printf("The Postfix Decremented Of Y Is = %d%n", y); // 19.
        --y; // Y = Y -1 = 19 - 1 = 18 , Decremented The Variable By One Before Executing , 
        // Or Running The Statement.
        System.out.printf("The Prefix Decremented Of X Is = %d%n", y); // Y = Y - 1 = 19 - 1 = 18.
        System.out.printf("The Prefix Decremented Again Of Y Is = %d%n ", --y); // Y = Y - 1 
        // = 18 - 1 = 17 , In This Case Decremented The Variable Frist , 
        // Before Executing , Or Running The Statement.
        System.out.print("\nThe Assignment Compound Operations Is : \n");
        int z = 20;
        z += 10; // z = z + 10 = 20 + 10 = 30;.
        System.out.printf("The Addifition Compound Assignment Operation Is = %d%n", z);
        z -= 5; // z = z - 5 = 30 - 5 = 25;
        System.out.printf("The Subtraction Compound Assignment Operation Is = %d%n", z);
        z *= 5; // z = z * 5 = 25 * 5 = 125;
        System.out.printf("The Multiplication Compound Assignment Operation Is = %d%n", z);
        z /= 10; // z = z / 10 = 125 / 10 = 12 Not 12.5 Because It Is Two Integer Numbers.;
        System.out.printf("The Division Assignment Compound Operation Is = %d%n", z);
        z %= 5; // z = z % 5 = 12 % 5 = 2
        System.out.printf("The Modulus Compound Assignment Operation Is = %d%n", z);
    }
}
