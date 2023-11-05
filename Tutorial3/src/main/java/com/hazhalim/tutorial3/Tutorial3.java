package com.hazhalim.tutorial3;

import java.util.Scanner;

public class Tutorial3
{

    public static void main(String[] args)
    {
        
        // Question 1
        
        // a)
        
//        if (3 * 8 == 27)
//        {
//            
//            System.out.println("3 multiplied by 8 is 27.");
//            
//        } else {
//            
//            System.out.println("3 multiplied by 8 is not 27.");
//            
//        }
        
        // b)
        
//        Scanner keyboard = new Scanner(System.in);
//        
//        int inputInt = keyboard.nextInt();
//        
//        if (inputInt % 2 == 0)
//        {
//            
//            System.out.println(inputInt + " is an even number.");
//            
//        } else {
//            
//            System.out.println(inputInt + " is an odd number.");
//            
//        }
        
        // c)
        
//        Scanner keyboard = new Scanner(System.in);
//        
//        System.out.print("Hi, please enter a character: ");
//        
//        String input = keyboard.next();
//        
//        char actualCharacter = input.charAt(0);
//        int asciiValue = (int) input.charAt(0);
//        
//        System.out.println("");
//        
//        if ((asciiValue >= 65) && (asciiValue <= 90))
//        {
//            
//            System.out.println(actualCharacter + " is a capital letter.");
//            
//        } else if ((asciiValue >= 97) && (asciiValue <= 122)) {
//            
//            System.out.println(actualCharacter + " is a lowercase letter.");
//            
//        } else {
//            
//            System.out.println(actualCharacter + " is a symbol.");
//            
//        }
        
        // d)
        
//        Scanner keyboard = new Scanner(System.in);
//        
//        String s1, s2;
//        
//        System.out.println("Input two strings, s1, and s2...");
//        System.out.print("String s1: ");
//        s1 = keyboard.nextLine();
//        
//        System.out.println("");
//        
//        System.out.print("String s2: ");
//        s2 = keyboard.nextLine();
//        
//        if (s1.compareToIgnoreCase(s2) < 0)
//        {
//            
//            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
//            
//        } else if (s1.compareToIgnoreCase(s2) > 0) {
//            
//            System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
//            
//        } else if (s1.compareToIgnoreCase(s2) == 0) {
//            
//            System.out.println("Both s1 and s2 are the same in terms of alphabetical order.");
//
//			System.out.println("\"" + s1 + "\" is in the same alphabetical order as \"" + s2 + "\"");
//            
//        } else {
//            
//            System.out.println("Error!");
//            
//        }
        
        // e)
        
//        Scanner keyboard = new Scanner(System.in);
//        
//        int input = keyboard.nextInt();
//        
//        switch (input)
//        {
//            
//            case 0:
//            {
//                
//                System.out.println("Sunday");
//                break;
//                
//            }
//            
//            case 1:
//            {
//                
//                System.out.println("Monday");
//                break;
//                
//            }
//            
//            case 2:
//            {
//                
//                System.out.println("Tuesday");
//                break;
//                
//            }
//            
//            case 3:
//            {
//                
//                System.out.println("Wednesday");
//                break;
//                
//            }
//            
//            case 4:
//            {
//                
//                System.out.println("Thursday");
//                break;
//                
//            }
//            
//            case 5:
//            {
//                
//                System.out.println("Friday");
//                break;
//                
//            }
//            
//            case 6:
//            {
//                
//                System.out.println("Saturday");
//                break;
//                
//            }
//            
//            default:
//            {
//                
//                System.out.println("Error! Only input a number between 0 and 6, please.");
//                break;
//                
//            }
//            
//        }
        
        // Question 2
        
        // a)
        
//        int num1, num2;
//        
//        if (num1 == num2)
//            System.out.println("Numer 1 is equal to number 2.");
        
        // b)
        
//        int x, y, z;
//        
//        if (x > y && x > z)
//                System.out.println("x is the largest number");
        
        // c)
        
//        String s1, s2;
//        
//        if (s1.equals(s2))
//            System.out.println("They are equal strings.");
//        else if (!s1.equals(s2))
//            System.out.println("They are not equal strings.");
        
        // d)
        
//        if (x > 0 || y > 0)
//            System.out.println("Either x or y is positive");
        
        // Question 3
        
//        int x = 9, y = 10;
        
        // a)
        
//        if (x < 10)
//        if (y > 10)
//        System.out.println("*****");
//        else
//        System.out.println("#####");
//        System.out.println("$$$$$");
        
        /*

        Output:
        
        #####
        $$$$$
        
        */
        
        // b)
        
//        if (x < 10) {
//        if (y < 10)
//        System.out.println("*****");
//        else{
//        System.out.println("#####");
//        System.out.println("$$$$$");
//        }}
        
        /*
        
        Output:
        
        #####
        $$$$$
        
        */
        
        // c)
        
//        if (x < 10) {
//        if (y < 10)
//        System.out.println("*****");
//        System.out.println("#####");
//        }
//        else {
//        System.out.println("$$$$$");
//        }
        
        /*
        
        Output:
        
        #####
        
        */
        
        // d)
        
//        if (x > 10) {
//        if (y > 10) {
//        System.out.println("*****");
//        System.out.println("#####"); }
//        else
//        System.out.println("$$$$$");
//        }
        
        /*
        
        Output:
        
        (nothing)
        
        */
        
        // Question 4
        
//        Scanner keyboard = new Scanner(System.in);
//        
//        System.out.print("Hi! Enter number 1, n1: ");
//        int n1 = keyboard.nextInt();
//        
//        System.out.println("");
//        
//        System.out.print("Next, enter number 2, n2: ");
//        int n2 = keyboard.nextInt();
//        
//        System.out.println("");
//        
//        System.out.print("Finally, enter number 3, n3: ");
//        int n3 = keyboard.nextInt();
//        
//        if ((n1 > n2) && (n1 > n3))
//        {
//            
//            System.out.println(n1 + " is the largest among the integers " + n1 + ", " + n2 + ", and " + n3 + ".");
//            
//        } else if ((n2 > n1) && (n2 > n3)) {
//            
//            System.out.println(n2 + " is the largest among the integers " + n1 + ", " + n2 + ", and " + n3 + ".");
//            
//        } else if ((n3 > n1) && (n3 > n2)) {
//            
//            System.out.println(n3 + " is the largest among the integers " + n1 + ", " + n2 + ", and " + n3 + ".");
//            
//        } else if ((n1 == n2) && (n2 == n3) && (n1 == n3)){
//            
//            System.out.println("All three integers are equal.");
//            
//        } else {
//            
//            System.out.println("Error!");
//            
//        }
        
        // Question 5
        
//        Scanner keyboard = new Scanner(System.in);
//        
//        System.out.print("Hi! Want to find out if a year is a leap year? Enter a year, please: ");
//        int inputYear = keyboard.nextInt();
//        
//        if (((inputYear % 4 == 0) && (inputYear % 100 != 0)) || (inputYear % 400 == 0))
//        {
//            
//            System.out.println("Yup, " + inputYear + " is a leap year!");
//            
//        } else {
//            
//            System.out.println("Sorry, but " + inputYear + " is NOT a leap year!");
//            
//        }
                
    }
    
}