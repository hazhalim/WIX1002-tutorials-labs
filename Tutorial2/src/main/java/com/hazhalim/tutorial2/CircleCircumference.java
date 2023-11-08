package com.hazhalim.tutorial2;

import java.util.Scanner;

public class CircleCircumference
{
    public static void main(String[] args)
    {
        
        double diameter, circumference;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter diameter: ");
        
        diameter = keyboard.nextDouble();
        
        circumference = 2 * Math.PI * (diameter / 2); // Circumference of a circle = 2 * π * r
        
        System.out.println("");
    
        System.out.printf("The circumference of the circle is : %.3f", circumference);
        
    }
        
}