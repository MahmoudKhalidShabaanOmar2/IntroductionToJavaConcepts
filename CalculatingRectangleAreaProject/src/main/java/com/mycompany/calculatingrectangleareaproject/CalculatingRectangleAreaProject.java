/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculatingrectangleareaproject;

/**
 *
 * @author moka
 */
// Write A Java Project To Calculate The Area Of The Rectangle =>
import java.util.Scanner;
public class CalculatingRectangleAreaProject{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Rectangle Length Is = ");
        float RectangleLength = input.nextFloat();
        System.out.printf("The Rectangle Length Is = %f%n", RectangleLength);
        System.out.print("Please Enter The Rectangle Width Is = ");
        float RectangleWidth = input.nextFloat();
        System.out.printf("The Rectangle Width Is = %f%n",RectangleWidth);
        float RectangleArea = RectangleLength * RectangleWidth;
        System.out.printf("The Rectangle Area Is = %f%n",RectangleArea);
    }
}