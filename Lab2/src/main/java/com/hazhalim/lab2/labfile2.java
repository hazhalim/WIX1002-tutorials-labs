package com.hazhalim.lab2;

import java.util.Random;

public class labfile2
{
    
    public static void main(String[] args)
    {
        
        Random rand = new Random();
        
        int randNum1, randNum2, randNum3;
        
        int min = 10, max = 50 + 1; // max is exclusive, so add 1
        
        randNum1 = rand.nextInt(max - min) + min;
        randNum2 = rand.nextInt(max - min) + min;
        randNum3 = rand.nextInt(max - min) + min;
        
        System.out.println("The three random numbers are: " + randNum1 + ", " + randNum2 + ", and " + randNum3);
        
        int sumRandNums = randNum1 + randNum2 + randNum3;
        
        double averageRandNums = (double) sumRandNums / 3.0;
        
        System.out.println("The sum of the three random numbers are: " + sumRandNums);
        
        System.out.printf("The average of the three random numbers are: %.2f", averageRandNums);
        
    }
    
}