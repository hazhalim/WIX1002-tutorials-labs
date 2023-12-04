package lab4;

import java.util.Random;

public class Lab4File2
{
    
    public static void main(String[] args)
    {
        
        Random rand = new Random();
        
        int min = 0;
        int max = 100 + 1; // max is exclusive, so add 1;
        
        int currentNumber = 2; // set the first number to check at 2, since we know 0 and 1 are not prime numbers
        int count = 0; // number of prime numbers found
        
        boolean isPrime = false; // boolean flag to check for a primeness of a number
        
        int n = rand.nextInt(max - min) + min;
        
        System.out.println("First " + n + " prime numbers: \n");
        
        while (count <= n) // Repeat while the number of prime numbers found is less than the amount that is wanted
        {
            
            for (int i = 2; i <= currentNumber; i++)
            {
                isPrime = true; // Assume the current number IS a prime number
                
                if (currentNumber % i == 0 && i != currentNumber)
                {
                    
                    isPrime = false; // When the current number is found to be divisible by something that is not itself, it is NOT a prime number
                    break;
                    
                }
                
            }
            
            if (isPrime)
            {
                
                System.out.println(currentNumber); // Print the number if it is prime
                count++; // Increment the number of prime numbers found
                
            }
            
            currentNumber++; // Move on to the next number
            
        }
        
    }
    
}