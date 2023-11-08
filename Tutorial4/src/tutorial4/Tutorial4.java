package tutorial4;

import java.util.Scanner;
import java.util.Random;

public class Tutorial4
{
    public static void main(String[] args)
    {
        /** Question 1 */
        
        // a)
        
//        int n = 0;
//
//        while ((int) Math.pow(n + 1, 3) < 2000)
//        {
//            
//            n++;
//            
//        }
//
//        System.out.println("The largest integer, n, where n^3 is less than 2000 is " + n + ". The value of " + n + "^3 is: " + (int) Math.pow(n, 3));
        
        // b)
        
//        for (int i = 1; i <= 12; i++)
//        {
//            
//            System.out.println(i + "^2: " + (int) Math.pow(i, 2));
//            
//        }
        
        // c)
        
        Random rand = new Random();
        
        int min = 0;
        int max = 100 + 1; // max is exclusive, so add 1
        
        for (int i = 0; i < 4; i++)
        {
            
            for (int j = 0; j < 5; j++)
            {
                
                int currentRandNum = rand.nextInt(max - min) + min;
                
                System.out.print(currentRandNum + "\t");
                
            }
            
            System.out.println("");
            
        }
        
    }
    
}