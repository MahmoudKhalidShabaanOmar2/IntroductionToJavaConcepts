/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingthenetsalaryprojectfromsalary;

/**
 *
 * @author moka
 */
// Write A Java Project To Get User Name , User Gender , User Salary , And Finally 
//Displaying The Net Salary After Dedcuting 10% From The Salary =>
import java.util.Scanner;
public class DisplayingTheNetSalaryProjectFromSalary{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The User Name Is : ");
        String UserName = input.next();
        System.out.printf("The User Name Is : %s%n", UserName);
        System.out.print("Please Enter The User Gender Is : ");
        String UserGender = input.next();
        System.out.printf("The User Gender Is : %s%n", UserGender);
        System.out.print("Please Enter The User Salary Is : ");
        float UserSalary = input.nextFloat();
        System.out.printf("The User Salary Is = %f%n", UserSalary);
        float NetUserSalary = UserSalary - (UserSalary * 0.10f);
        System.out.printf("The New User Salary After Deducting 10 Percentage Is = %f%n",NetUserSalary);
    }
}