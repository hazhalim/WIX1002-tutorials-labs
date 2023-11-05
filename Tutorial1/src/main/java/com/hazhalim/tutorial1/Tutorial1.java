package com.hazhalim.tutorial1;

import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class Tutorial1
{

    public static void main(String[] args) 
    {
        
        /** Question 6 */
        
//        Random rand = new Random();
//        
//        int[] randomNumbers = new int[10];
//        
//        for (int i = 0; i < 10; i++)
//        {
//            
//            randomNumbers[i] = rand.nextInt();
//            
//        }
//        
//        System.out.println("\nThe list of 10 random numbers is: \n");
//
//        for (int i = 0; i < 10; i++)
//        {
//            
//            System.out.println(randomNumbers[i]);
//            
//        }
//        
//        // Find smallest number
//        
//        int minimumNumber = randomNumbers[0];
//        
//        for (int i = 0; i < 10; i++)
//        {
//            
//            if (randomNumbers[i] < minimumNumber)
//            {
//                
//                minimumNumber = randomNumbers[i];
//                
//            }
//            
//        }
//        
//        System.out.println("\nThe minimum number in the 10 numbers is: " + minimumNumber);
//        
//        /** Question 7 */
//        
//        Random rand = new Random();
//        int max = 100 + 1; // max number is exclusive
//        int min = 10;
//        int[] randomNumbers = new int[10];
//        
//        for (int i = 0; i < randomNumbers.length; i++)
//        {
//            
//            randomNumbers[i] = rand.nextInt(max - min) + min;
//            
//        }
//        
//        System.out.print("\nEven numbers: ");
//        
//        for (int i = 0; i < randomNumbers.length; i++)
//        {
//            
//            if (randomNumbers[i] % 2 == 0)
//            {
//                
//                System.out.print(randomNumbers[i] + " ");
//                
//            }
//            
//        }
//        
//        System.out.print("\nOdd numbers: ");
//        
//        for (int i = 0; i < randomNumbers.length; i++)
//        {
//            
//            if (randomNumbers[i] % 2 == 1)
//            {
//                
//                System.out.print(randomNumbers[i] + " ");
//                
//            }
//            
//        }
        
        /** Question 8 */
        
//        Scanner keyboard = new Scanner(System.in);
//        
//        String initialInput;
//        int UCounter = 0;
//        int MCounter = 0;
//        
//        System.out.println("Hey girlypop, please enter a sentence, and we'll calculate how many U and M letters are in there!: ");
//        
//        initialInput = keyboard.nextLine();
//        
//        char[] characterArr = initialInput.toCharArray();
//        
//        for (char c : characterArr)
//        {
//            
//            if (c == 'U' || c == 'u')
//            {
//                
//                ++UCounter;
//                
//            }
//            
//            if (c == 'M' || c == 'm')
//            {
//                
//                ++MCounter;
//                
//            }
//            
//        }
//        
//        System.out.println("The number of U characters in the string is: " + UCounter);
//        System.out.println("The number of M characters in the string is: " + MCounter);
//        
//        System.out.println("Yasssss perioddtt zaddy werk!");
        
        /** Question 11 using Arrays and Collections class */
        
//        Random rand = new Random();
//        
//        int min = 0;
//        int max = 100 + 1; // max number is exclusive, limit random numbers from 0 - 100
//        
//        Integer[] randomNumbers = new Integer[5];
//        
//        for (int i = 0; i < randomNumbers.length; i++)
//        {
//            
//            randomNumbers[i] = rand.nextInt(max - min) + min;
//            
//        }
//        
//        Arrays.sort(randomNumbers, Collections.reverseOrder()); // sort using Array and Collections class
//        
//        System.out.print("\nSorted random numbers, descending: ");
//        
//        for (int n : randomNumbers)
//        {
//            
//            System.out.print(n + " ");
//            
//        }
        
        /** Question 11 using bubble sort algorithm */
        
//        Random rand = new Random();
//        
//        int min = 0;
//        int max = 100 + 1; // max number is exclusive, limit random numbers from 0 - 100
//        int temp = 0;
//        
//        Integer[] randomNumbers = new Integer[5];
//        
//        // Generate list of 5 random numbers
//        for (int i = 0; i < randomNumbers.length; i++)
//        {
//            
//            randomNumbers[i] = rand.nextInt(max - min) + min;
//            
//        }
//        
//        // Bubble sort in descending order
//        for (int i = 0; i < randomNumbers.length - 1; i++)
//        {
//            
//            for (int j = 0; j < randomNumbers.length - i - 1; j++)
//            {
//                
//                if (randomNumbers[j] < randomNumbers[j + 1])
//                {
//                    
//                    temp = randomNumbers[j];
//                    randomNumbers[j] = randomNumbers[j + 1];
//                    randomNumbers[j + 1] = temp;
//                    temp = 0;
//                    
//                }
//                
//            }
//                 
//        }
//        
//        System.out.print("\nSorted random numbers, descending: ");
//        
//        for (int n : randomNumbers)
//        {
//            
//            System.out.print(n + " ");
//            
//        }
        
        /** Question 12 */
        
        Random rand = new Random();
        
        Scanner keyboard = new Scanner(System.in);
        
        // Range of number generated is from 0 to 10
        int min = 0;
        int max = 10 + 1; // max is exclusive, 11 will include 10
        
        int attempts = 0;
        int actualNumber = rand.nextInt(max - min) + min;
        
        System.out.println("Hey, girlypop! Let's see you try to guess a random number generated by the program! The range of the number is from 0 to 10, try and guess: ");
        
        while (1 == 1) // infinite loop, broken when guess is correct
        {
            
            if (attempts != 0)
            {
                
                System.out.println("\nLet's try again, shall we? Guess: ");
                
            }
            
            int guessedNumber = keyboard.nextInt();
            
            if (guessedNumber == actualNumber)
            {
                
                ++attempts;
                
                System.out.println("\nCongrats, bestie! " + guessedNumber + " is the number generated by the computer!");
                System.out.println("\nYou solved this guessing game in just " + attempts + " attempts! Woohoo!");
                
                break; // Break out of this infinite loop when guess is correct
                
            } else if (guessedNumber < actualNumber) {
                
                ++attempts;
                
                System.out.println("\nI'm sorry, but your guess is not correct! The actual number is higher than your guess...");
                System.out.println("\n--------------------------------------------");
                
            } else if (guessedNumber > actualNumber) {
                
                ++attempts;
                
                System.out.println("\nI'm sorry, but your guess is not correct! The actual number is lower than your guess...");
                System.out.println("\n--------------------------------------------");
                
            } else {
                
                System.out.println("\nError! The actual number does not comply to any of the conditions of the game! Please check the source code for logic errors... Exiting game!");
                System.out.println("\n--------------------------------------------");
                
                break;
                
            }
            
        }
        
    }
    
}