package com.hazhalim.lab2;

import java.util.Scanner;
import java.util.Random;

public class Lab2 {

    public static void main(String[] args)
    {
        
        /*
        
        1. Write a program that convert the temperature in degree Fahrenheit to degree Celsius.
        The program will display the degree Celsius in two decimal places.
        Celsius = (Fahrenheit – 32) / 1.8
        
        */
        
//        double Celsius, Fahrenheit;
//        
//        Scanner keyboard = new Scanner(System.in);
//        
//        System.out.println("Hey girlypop, please enter the temperature in Fahrenheit: ");
//        
//        Fahrenheit = keyboard.nextDouble();
//        
//        Celsius = (Fahrenheit - 32) / 1.8;
//        
//        System.out.printf("The temperature in Celsius is : %.2f ºC", Celsius);
        
        /*
        
        2. Write a program to calculate the monthly payment for car loan. The following are the
        inputs of the program. Output the monthly payment in two decimal places.
        
        P The price of the car
        D Down payment
        R Interest Rate in %
        Y Loan duration in year
        M Monthly Payment
        
        M = (P – D) * (1 + R*Y/100) / (Y *12)
        
        */
        
//        double P, D, R, Y, M;
//        
//        Scanner keyboard = new Scanner(System.in);
//        
//        System.out.print("Enter the price of the car, in RM: ");
//        
//        P = keyboard.nextDouble();
//        
//        System.out.println("");
//        
//        System.out.print("Enter the down payment of the car, in RM: ");
//        
//        D = keyboard.nextDouble();
//        
//        System.out.println("");
//        
//        System.out.print("Enter the interest rate of the car, in %: ");
//        
//        R = keyboard.nextDouble();
//        
//        System.out.println("");
//        
//        System.out.print("Enter the loan duration of the car, in years: ");
//        
//        Y = (double) keyboard.nextInt();
//        
//        System.out.println("");
//        
//        M = (P - D) * (1 + R * Y / 100) / (Y * 12);
//        
//        System.out.printf("The monthly payment of the car is: RM%.2f", M);
        
        /*
        
        3. Write a program that generates three random numbers. The range of the random
        number is 10 to 50. Display the three numbers, sum of the numbers and the average in
        two decimal places.
        
        */
        
//        Random rand = new Random();
//        
//        int randNum1, randNum2, randNum3;
//        
//        int min = 10, max = 50 + 1; // max is exclusive, so add 1
//        
//        randNum1 = rand.nextInt(max - min) + min;
//        randNum2 = rand.nextInt(max - min) + min;
//        randNum3 = rand.nextInt(max - min) + min;
//        
//        System.out.println("The three random numbers are: " + randNum1 + ", " + randNum2 + ", and " + randNum3);
//        
//        int sumRandNums = randNum1 + randNum2 + randNum3;
//        
//        double averageRandNums = (double) sumRandNums / 3.0;
//        
//        System.out.println("The sum of the three random numbers are: " + sumRandNums);
//        
//        System.out.printf("The average of the three random numbers are: %.2f", averageRandNums);
        
        /*
        
        4. Write a program that converts the seconds to hours, minutes and seconds.
        
        */
        
//        Scanner keyboard = new Scanner(System.in);
//        
//        int initialSeconds, hours, minutes, seconds;
//        
//        System.out.print("Hi! Please enter the number of seconds to be converted to hours, minutes, and seconds: ");
//        
//        initialSeconds = keyboard.nextInt();
//        
//        hours = initialSeconds / 3600;
//        
//        minutes = (initialSeconds % 3600) / 60;
//        
//        seconds = (initialSeconds % 3600) % 60;
//        
//        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds", initialSeconds, hours, minutes, seconds);

        /*
        
        5. Write a program that generates one random number. The range of the random
        number is 0 to 10000. Display the number and the sum of all the digits in the number.
        
        */
        
//        Random rand = new Random();
//        
//        int min = 0, max = 10000 + 1; // max is exclusive, add 1
//        
//        int randNum = rand.nextInt(max - min) + min;
//        
//        int randNumSave = randNum;
//        
//        int currentDigit, sumOfDigits = 0;
//        
//        System.out.println("The random number generated is: " + randNum);
//        
//        while (randNum > 0)
//        {
//            
//            currentDigit = randNum % 10;
//            
//            sumOfDigits += currentDigit;
//            
//            randNum /= 10;
//            
//        }
//        
//        System.out.println("The sum of the digits of " + randNumSave + " is: " + sumOfDigits);
        
        /*
        
        6. Write a program that calculates the energy needed to heat water.
        Q = M * (final temperature – initial temperature) * 4184
        M = Weight of water in kg
        Q = Energy in joules
        The temperature are in degrees Celsius
        
        */
                
//        double M, Q, initTemp, finalTemp;
//        
//        Scanner keyboard = new Scanner(System.in);
//        
//        System.out.print("Enter the amount of water in grams, g: ");
//        
//        M = keyboard.nextDouble() / 1000; // convert to kilograms, kg
//        
//        System.out.println("");
//        
//        System.out.print("Enter the initial temperature in Fahrenheit, F: ");
//        
//        initTemp = (keyboard.nextDouble() - 32) / 1.8; // convert to Celsius, ºC
//        
//        System.out.println("");
//        
//        System.out.print("Enter the final temperature in Fahrenheit, F: ");
//        
//        finalTemp = (keyboard.nextDouble() - 32) / 1.8; // convert to Celsius, ºC
//        
//        System.out.println("");
//        
//        Q = M * (finalTemp - initTemp) * 4184; // formula for energy
//        
//        System.out.printf("The energy needed to heat the water is %.6e J.", Q);
         
    }
    
}