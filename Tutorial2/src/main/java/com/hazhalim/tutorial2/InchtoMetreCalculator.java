package com.hazhalim.tutorial2;

import java.util.Scanner;

public class InchtoMetreCalculator
{
    
    public static void main(String[] args)
    {
      
        double inches, metres;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter value in inch: ");
        
        inches = keyboard.nextDouble();
        
        metres = (inches * 2.54) / 100; // Divided by 100 is to convert from cm to m
        
        System.out.printf("%.2f inches = %.2f metres", inches, metres);
        
        System.out.println("");
        
    }
    
}