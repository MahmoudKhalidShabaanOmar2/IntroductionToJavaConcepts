/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.acceptinputswithdifferentdatatypesfromtheuser;

/**
 *
 * @author moka
 */
import java.util.Scanner;
public class AcceptInputsWithDifferentDataTypesFromTheUser{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Integer Number Is = ");
        int FristNum = input.nextInt();
        System.out.printf("The Frist Integer Number Is = %d", FristNum,"/n");
        System.out.print("\nPlease Enter The Second Float Number Is = ");
        float SecondNum = input.nextFloat();
        System.out.printf("The Second Float Number Is = %f ",SecondNum,"\n");
        System.out.print("\nPlease Enter The Third Short Integer Number Is = ");
        short ThirdNum = input.nextShort();
        System.out.printf("The Third Short Integer Number Is = %d", ThirdNum,"\n");
        System.out.print("\nPlease Enter The Fourth Long Integer Number Is = ");
        long FourthNum = input.nextLong();
        System.out.printf("The Fourth Long Integer Number Is = %d ", FourthNum,"\n");
        System.out.print("\nPlease Enter The Character Is : ");
        char character = input.next().charAt(0);
        System.out.printf("The Character Is : %c%n", character,"\n");
        System.out.print("The String Statement Is : ");
        String str = input.next();
        System.out.printf("The String Statement Is : %s%n", str);
    }
}