package com.hazhalim.lab3;

import java.util.Scanner;
import java.util.Random;

public class Lab3 {

    public static void main(String[] args)
    {
        
        // Question 1
        
//        Scanner keyboard = new Scanner(System.in);
//        
//        int n1, n2;
//        String operationStr;
//        
//        System.out.print("Enter two integer number: ");
//        n1 = keyboard.nextInt();
//        n2 = keyboard.nextInt();
//        
//        System.out.print("Enter the operand: ");
//        operationStr = keyboard.next();
//        
//        char operation = operationStr.charAt(0);
//        
//        switch (operation)
//        {
//            
//            case '+' -> System.out.println(n1 + " " + operation + " " + n2 + " = " + (n1 + n2));
//            
//            case '-' -> System.out.println(n1 + " " + operation + " " + n2 + " = " + (n1 - n2));
//            
//            case '*' -> System.out.println(n1 + " " + operation + " " + n2 + " = " + (n1 * n2));
//            
//            case '/' -> System.out.println(n1 + " " + operation + " " + n2 + " = " + (n1 / n2));
//            
//            case '%' -> System.out.println(n1 + " " + operation + " " + n2 + " = " + (n1 % n2));
//            
//            default -> System.out.println("Error!");
//            
//        }
        
        // Question 2
        
//        Random rand = new Random();
//        
//        int min = 0;
//        int max = 5 + 1; // max is exclusive, so add 1
//        
//        int randInt = rand.nextInt(max - min) + min;
//        
//        switch(randInt)
//        {
//            
//            case 0 -> System.out.println(randInt + " is zero.");
//            
//            case 1 -> System.out.println(randInt + " is one.");
//            
//            case 2 -> System.out.println(randInt + " is two.");
//            
//            case 3 -> System.out.println(randInt + " is three.");
//            
//            case 4 -> System.out.println(randInt + " is four.");
//            
//            case 5 -> System.out.println(randInt + " is five.");
//            
//            default -> System.out.println("Error!");
//            
//        }
        
        // Question 3
        
//        Scanner keyboard = new Scanner(System.in);
//        
//        int salesVolume;
//        double commission = 0; // don't need to initialise to 0 if operators like +=, etc. where the variable itself is used, is not used later in the program
//        
//        System.out.print("Hi! Want to know your total commission? Enter your sales volume here: ");
//        
//        salesVolume = keyboard.nextInt();
//        
//        System.out.println("");
//        
//        if (salesVolume <= 100)
//            commission = (5.0 / 100) * salesVolume;
//        else if ((salesVolume > 100) && (salesVolume <= 500))
//            commission = (7.5 / 100) * salesVolume;
//        else if ((salesVolume > 500) && (salesVolume <= 1000))
//            commission = (10.0 / 100) * salesVolume;
//        else if (salesVolume > 1000)
//            commission = (12.5 / 100) * salesVolume;
//        else
//            System.out.println("Error!");
//        
//        System.out.printf("Your total commission is: RM%.2f", commission);
        
        // Question 4
        
//        Random rand = new Random();
//        
//        int min = 1;
//        int max = 6 + 1; // max is exclusive, so add 1
//        
//        int dice1 = 0;
//        int dice2 = 0;
//        int totalPlayer1 = 0;
//        int totalPlayer2 = 0;
//        
//        System.out.println("Hey, let's play a dice game!");
//        System.out.println("\nPlayer 1, you can start first...");
//        
//        System.out.println("\n-----=Player 1=-----");
//        
//        dice1 = rand.nextInt(max - min) + min;
//        
//        System.out.println("\nPlayer 1 got " + dice1 + " for his first roll! Now, let's do another...");
//        
//        dice2 = rand.nextInt(max - min) + min;
//        
//        System.out.println("\nPlayer 1 got " + dice2 + " for his second roll!");
//        
//        totalPlayer1 = dice1 + dice2;
//        
//        System.out.println("\nPlayer 1, in total, rolled a " + totalPlayer1 + "!");
//        
//        dice1 = 0;
//        dice2 = 0;
//        
//        System.out.println("\nPlayer 2, you are next!");
//        
//        System.out.println("\n-----=Player 2=-----");
//        
//        dice1 = rand.nextInt(max - min) + min;
//        
//        System.out.println("\nPlayer 2 got " + dice1 + " for his first roll! Now, let's do another...");
//        
//        dice2 = rand.nextInt(max - min) + min;
//        
//        System.out.println("\nPlayer 2 got " + dice2 + " for his second roll!");
//        
//        totalPlayer2 = dice1 + dice2;
//        
//        System.out.println("\nPlayer 2, in total, rolled a " + totalPlayer2 + "!");
//        
//        dice1 = 0;
//        dice2 = 0;
//        
//        System.out.println("\n-----=Results=-----\n");
//        if (totalPlayer1 > totalPlayer2)
//            System.out.println("\nPlayer 1 wins, with their " + totalPlayer1 + " over Player 2's " + totalPlayer2 + "! Woot woot!");
//        else if (totalPlayer2 > totalPlayer1)
//            System.out.println("Player 2 wins, with their " + totalPlayer2 + " over Player 1's " + totalPlayer1 + "! Woot woot!");
//        else if (totalPlayer1 == totalPlayer2)
//            System.out.println("Player 1 is tied with Player 2 at " + totalPlayer1 + "! Woot woot!");
//        else
//            System.out.println("Error!");
        
        // Question 5
        
//        Scanner keyboard = new Scanner(System.in);
//        
//        double a, b, c, d, x, y, e, f;
//        
//        System.out.print("Please enter the value of a: ");
//        a = keyboard.nextDouble();
//        
//        System.out.print("Please enter the value of b: ");
//        b = keyboard.nextDouble();
//        
//        System.out.print("Please enter the value of c: ");
//        c = keyboard.nextDouble();
//        
//        System.out.print("Please enter the value of d: ");
//        d = keyboard.nextDouble();
//        
//        System.out.print("Please enter the value of e: ");
//        e = keyboard.nextDouble();
//        
//        System.out.print("Please enter the value of f: ");
//        f = keyboard.nextDouble();
//        
//        if (((a * d) - (b * c)) == 0)
//        {
//            
//            System.out.println("The equation has no solution");
//            
//        } else {
//            
//            x = ((e * d) - (b * f)) / ((a * d) - (b * c));
//            y = ((a * f) - (e * c)) / ((a * d) - (b * c));
//            
//            System.out.printf("The value of x is: %.4f", x);
//            System.out.printf("\nThe value of y is: %.4f", y);
//            
//        }
        
        // Question 6
        
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