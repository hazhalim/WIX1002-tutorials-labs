package com.hazhalim.lab3;

import java.util.Scanner;

public class Lab3File2
{
    
    public static void main(String[] args)
    {
        
        Scanner keyboard = new Scanner(System.in);
        
        double radius, x, y, distance;
        
        System.out.print("Hi, please enter the radius of a circle centred at (0.0000, 0.0000): ");
        
        radius = keyboard.nextDouble();
        
        System.out.println("");
        
        System.out.print("Next, please enter the value of coordinate x: ");
        
        x = keyboard.nextDouble();
        
        System.out.println("");
        
        System.out.print("Next, please enter the value of coordinate y: ");
        
        y = keyboard.nextDouble();
                
        // Calculate distance from radius using distance formula
        // If distance less than radius, inside the circle
        // If distance equal to radius, on the radius/border/edge of the circle
        // If distance larger than radius, outside the circle
        // Formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        
        distance = Math.sqrt((Math.pow(x - 0, 2)) + Math.pow(y - 0, 2));
        
        System.out.printf("\nRadius: %.4f", radius);
        System.out.printf("\nx: %.4f", x);
        System.out.printf("\ny: %.4f", y);
        System.out.printf("\nDistance from Radius: %.4f", distance);
        
        System.out.println("\n");
        
        if (distance < radius)
            System.out.printf("\nPoint (%.4f, %.4f) is inside of the circle centred at (0.0000, 0.0000).", x, y);
        else if (distance == radius)
            System.out.printf("\nPoint (%.4f, %.4f) is on the radius of the circle centred at (0.0000, 0.0000).", x, y);
        else if (distance > radius)
            System.out.printf("\nPoint (%.4f, %.4f) is outside of the circle centred at (0.0000, 0.0000).", x, y);
        else
            System.out.println("Error!");
            
    }
        
}