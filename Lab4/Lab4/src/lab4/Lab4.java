package lab4;

import java.util.Scanner;
import java.util.Random;

public class Lab4
{

    public static void main(String[] args)
    {
        
        /** Question 1 */
        
//        Scanner keyboard = new Scanner(System.in);
//        
//        System.out.print("Enter an Integer: ");
//        
//        int number = keyboard.nextInt();
//        
//        System.out.print("\nThe factors are: ");
//        for (int i = 1; i <= number; i++)
//        {
//            
//            if (number % i == 0)
//            {
//                
//                if (i != number)
//                {
//                    
//                    System.out.print(i + ", ");
//                    
//                } else {
//                    
//                    System.out.print(i); // this else-block to avoid comma at the end of the line after last factor
//                    
//                }
//                
//            }
//            
//        }
        
        /** Question 2 */
        
//        Scanner keyboard = new Scanner(System.in);
//        
//        System.out.print("Hi, enter an integer, n: ");
//        
//        int n = keyboard.nextInt();
//        
//        int sumMinusOne = 0;
//        int sum = 0;
//        
//        for (int i = 1; i <= n; i++)
//        {
//            
//            
//            sumMinusOne += i;
//            
//            sum += sumMinusOne;
//            
//        }
//        
//        System.out.println(sum);
        
        /** Question 3 */
        
//        Scanner keyboard = new Scanner(System.in);
//        
//        int scoreValue = 0;
//        int n = 0;
//        int minimumScore = 0;
//        int maximumScore = 0;
//        int sum = 0;
//        int sumSquared = 0;
//        double averageScore = 0;
//        double stdDeviation = 0;
//        boolean minimumScoreFlag = false;
//        
//        while (scoreValue >= 0)
//        {
//            
//            System.out.print("Enter a score [negative score to quit]: ");
//            
//            scoreValue = keyboard.nextInt();
//            
//            if (scoreValue >= 0)
//            {
//                
//                n++;
//            
//                if (minimumScoreFlag == false)
//                {
//                
//                    minimumScore = scoreValue;
//                    minimumScoreFlag = true;
//                
//                }
//            
//                sum += scoreValue;
//                sumSquared += (int) Math.pow(scoreValue, 2);
//            
//                if (scoreValue < minimumScore && scoreValue >= 0)
//                {
//                
//                    minimumScore = scoreValue;
//                
//                }
//            
//                if (scoreValue > maximumScore)
//                {
//                
//                    maximumScore = scoreValue;
//                
//                }
//                
//            } else {
//                
//                break;
//                
//            }
//         
//        }
//        
//        averageScore = sum / n;
//            
//        stdDeviation = (double) Math.sqrt(((double) sumSquared - (Math.pow((double) sum, 2) / (double) n)) / ((double) n - 1.0));
//        
//        System.out.println("\nSum: " + sum);
//        System.out.println("Sum of Squares: " + sumSquared);
//        System.out.println("Minimum Score: " + minimumScore);
//        System.out.println("Maximum Score: " + maximumScore);
//        System.out.printf("Average Score: %.2f", averageScore);
//        System.out.printf("\nStandard Deviation: %.2f", stdDeviation);
        
        
        /** Question 4 */
        
//        Scanner keyboard = new Scanner(System.in);
//        
//        System.out.print("Hi, please enter the year: ");
//        
//        boolean isLeapYear;
//        boolean isCalendarGapPrinted = false;
//
//        int inputYear = keyboard.nextInt();
//        
//        int firstDayOfYear = 0;
//        int daysInMonth = 31;
//        int daysCount = 1;
//        int calendarGapCount = 0;
//        
//        int firstDayOfMay;
//        int firstDayOfAugust;
//        
//        String firstDayOfMayString = "";
//        String firstDayOfAugustString = "";
//        
//        if (((inputYear % 4 == 0) && (inputYear % 100 != 0)) || (inputYear % 400 == 0))
//        {
//            
//            isLeapYear = true;
//            
//        } else {
//            
//            isLeapYear = false;
//            
//        }
//        
//        System.out.print("\nThank you, now enter the first day of the year (0 for Sunday, 1 for Monday, ... , 6 for Saturday): ");
//        
//        firstDayOfYear = keyboard.nextInt();
//        
//        System.out.println("");
//        
//        if (isLeapYear)
//        {
//            
//            firstDayOfMay = (((122 % 7) + firstDayOfYear) % 7) - 1; // In a leap year, 1st of May is the 122th day of the year
//            firstDayOfAugust = (((214 % 7) + firstDayOfYear) % 7) - 1; // In a leap year, 1st of August is the 214th day of the year
//            
//            System.out.println(inputYear + " is a leap year!\n");
//            
//        } else {
//            
//            firstDayOfMay = (((121 % 7) + firstDayOfYear) % 7) - 1; // In a non-leap year, 1st of May is the 121th day of the year
//            firstDayOfAugust = (((213 % 7) + firstDayOfYear) % 7) - 1; // In a non-leap year, 1st of August is the 213th day of the year
//            
//            System.out.println(inputYear + " is not a leap year.\n");
//            
//        }
//        
//        // Checking if the first days of the months are negative, and possible correction
//        
//        if (firstDayOfMay < 0)
//        {
//            
//            while (firstDayOfMay < 0)
//            {
//                
//                firstDayOfMay += 7;
//                
//            }
//            
//        }
//        
//        if (firstDayOfAugust < 0)
//        {
//            
//            while (firstDayOfAugust < 0)
//            {
//                
//                firstDayOfAugust += 7;
//                
//            }
//            
//        }
//        
//        // For the month of May
//        
//        switch (firstDayOfMay) // Determine the day of the week of the 1st of May
//        {
//            
//            case 0 -> firstDayOfMayString = "Sunday";
//            case 1 -> firstDayOfMayString = "Monday";
//            case 2 -> firstDayOfMayString = "Tuesday";
//            case 3 -> firstDayOfMayString = "Wednesday";
//            case 4 -> firstDayOfMayString = "Thursday";
//            case 5 -> firstDayOfMayString = "Friday";
//            case 6 -> firstDayOfMayString = "Saturday";
//            
//        }
//        
//        System.out.println("First day of May " + inputYear + ": " + firstDayOfMayString + "\n");
//        
//        // Print month of May of the year
//        System.out.println("May " + inputYear + "\n");
//        
//        // Print days of the week row
//        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
//        
//        // Print the start of month gap and days of the month
//        
//        calendarGapCount = 0; // Reset the start-of-month calendar gap counter
//        daysCount = 1; // Reset the day of the month to be printed
//        
//        for (int i = 0; i < 6; i++) 
//        {
//            
//            
//            for (int j = 0; j < 7; j++)
//            {
//                
//                if (calendarGapCount < firstDayOfMay)
//                {
//                    
//                    calendarGapCount++;
//                    
//                } else if (daysCount <= daysInMonth) {
//                    
//                    System.out.print(daysCount);
//                    daysCount++;
//                    
//                }
//                
//                System.out.print("\t");
//                
//            
//            }
//            
//            System.out.println("");
//            
//        }
//        
//        System.out.println("\n-------------------------------------------------\n");
//        
//        // For the month of August
//        
//        switch (firstDayOfAugust) // Determine the day of the week of the 1st of May
//        {
//            
//            case 0 -> firstDayOfAugustString = "Sunday";
//            case 1 -> firstDayOfAugustString = "Monday";
//            case 2 -> firstDayOfAugustString = "Tuesday";
//            case 3 -> firstDayOfAugustString = "Wednesday";
//            case 4 -> firstDayOfAugustString = "Thursday";
//            case 5 -> firstDayOfAugustString = "Friday";
//            case 6 -> firstDayOfAugustString = "Saturday";
//            
//        }
//        
//        System.out.println("First day of August " + inputYear + ": " + firstDayOfAugustString + "\n");
//        
//        // Print month of August of the year
//        System.out.println("August " + inputYear + "\n");
//        
//        // Print days of the week row
//        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
//        
//        // Print the start of month gap and days of the month
//        
//        calendarGapCount = 0; // Reset the start-of-month calendar gap counter
//        daysCount = 1; // Reset the day of the month to be printed
//        
//        for (int i = 0; i < 6; i++) 
//        {
//            
//            
//            for (int j = 0; j < 7; j++)
//            {
//                
//                if (calendarGapCount < firstDayOfAugust)
//                {
//                    
//                    calendarGapCount++;
//                    
//                } else if (daysCount <= daysInMonth) {
//                    
//                    System.out.print(daysCount);
//                    daysCount++;
//                    
//                }
//                
//                System.out.print("\t");
//                
//            
//            }
//            
//            System.out.println("");
//            
//        }
        
        /** Question 5 */
        
//        Random rand = new Random();
//        
//        int min = 1;
//        int max = 6 + 1; // max is exclusive, so add 1
//        
//        int dice;
//        
//        int player1Dice = 0;
//        int player2Dice = 0;
//        int round = 1;
//        
//        // Introductory messages
//        System.out.println("---=Dice Game=---");
//        System.out.println("\nPlayer 1 will be competing against Player 2 to see who is the first to accumulate more than 100 points!");
//        System.out.println("\nLet's start with the first round...");
//        
//        while (player1Dice <= 100 && player2Dice <= 100)
//        {
//            
//            System.out.println("\n---=Round " + round + "=---");
//            
//            System.out.print("\nPlayer 1 rolls the dice: ");
//            dice = rand.nextInt(max - min) + min;
//            System.out.print(dice);
//            
//            if (dice == 6)
//            {
//                
//                while (dice == 6)
//                {
//                    
//                    System.out.print("\nPlayer 1 rolls the dice again: ");
//                    dice = rand.nextInt(max - min) + min;
//                    System.out.print(dice);
//                    
//                    if (dice == 6)
//                    {
//                        
//                        player1Dice += dice;
//                        
//                    } else {
//                        
//                        System.out.println("\n");
//                        break;
//                        
//                    }
//                    
//                    System.out.println("");
//                    
//                }
//
//            } else {
//                
//                player1Dice += dice;
//                
//                System.out.println("\n");
//                
//            }
//            
//            System.out.println("---------");
//            
//            System.out.print("\nPlayer 2 rolls the dice: ");
//            dice = rand.nextInt(max - min) + min;
//            System.out.print(dice);
//            
//            if (dice == 6)
//            {
//                
//                while (dice == 6)
//                {
//                    
//                    System.out.print("\nPlayer 2 rolls the dice again: ");
//                    dice = rand.nextInt(max - min) + min;
//                    System.out.print(dice);
//                    
//                    if (dice == 6)
//                    {
//                        
//                        player2Dice += dice;
//                        
//                    } else {
//                        
//                        System.out.println("\n");
//                        break;
//                        
//                    }
//                    
//                    System.out.println("");
//                    
//                }
//
//            } else {
//                
//                player2Dice += dice;
//                
//                System.out.println("\n");
//                
//            }
//            
//            System.out.println("---=End of Round " + round + "=---");
//            
//            System.out.println("\n---=Post-Round " + round + " Results=---");
//            System.out.println("\nPlayer 1's score: " + player1Dice + " points");
//            System.out.println("\nPlayer 2's score: " + player2Dice + " points");
//            
//            if (player1Dice > player2Dice)
//            {
//            
//                System.out.println("\nPlayer 1 is leading by " + (player1Dice - player2Dice) + " point(s)!");
//            
//            } else if (player1Dice < player2Dice) {
//
//                System.out.println("\nPlayer 2 is leading by " + (player2Dice - player1Dice) + " point(s)!");
//
//            } else {
//
//                System.out.println("\nBoth Player 1 and Player 2 are currently tied at " + player1Dice + " points!");
//
//            }
//            
//            round++;
//            
//        }
//        
//        System.out.println("\n---=Final Results=---\n");
//        
//        if (player1Dice > player2Dice)
//        {
//            
//            System.out.println("Player 1's score: " + player1Dice);
//            System.out.println("Player 2's score: " + player2Dice);
//            System.out.println("\nPlayer 1 WINS, leading by " + (player1Dice - player2Dice) + " point(s) over Player 2! Congratulations, Player 1!");
//            
//        } else if (player1Dice < player2Dice) {
//            
//            System.out.println("Player 1's score: " + player1Dice);
//            System.out.println("Player 2's score: " + player2Dice);
//            System.out.println("\nPlayer 2 WINS, leading by " + (player2Dice - player1Dice) + " point(s) over Player 1! Congratulations, Player 2!");
//            
//        } else {
//            
//            System.out.println("Both Player 1 and Player 2 are at " + player1Dice + " points. It's a tie! Congratulations to both Player 1 and Player 2!");
//            
//        }
        
        /** Question 6 */
        
//        Random rand = new Random();
//        
//        int min = 1;
//        int max = Integer.MAX_VALUE + 1; // max is exclusive, so add 1
//        
//        int count = 1; // Number of digits in the random integer
//        
//        int randNum = rand.nextInt(max - min) + min; // Generate the random integer
//        
//        System.out.print(randNum + "'s amount of digits: ");
//        
//        while (randNum != 0)
//        {
//            
//            randNum /= 10;
//            
//            if (randNum != 0)
//            {
//                
//                count++;
//                
//            }
//            
//        }
//        
//        System.out.print(count);
        
        /** Question 7 */
        
//        Scanner keyboard = new Scanner(System.in);
//        
//        double monthlyPayment, principal, interestRate, numMonths, principalDue, monthConsideration, interestDue, principalBalance, totalInterest;
//        
//        monthConsideration = 1.0;
//        totalInterest = 0.0;
//        
//        System.out.print("Enter principal amount: ");
//        principal = keyboard.nextDouble();
//        
//        System.out.print("Enter interest in %: ");
//        interestRate = keyboard.nextDouble();
//        
//        System.out.print("Enter total number of month(s): ");
//        numMonths = keyboard.nextDouble();
//        
//        System.out.println("");
//        
//        System.out.println("Month\tMonthly Payment\tPrincipal\tInterest\tUnpaid Balance\tTotal Interest");
//        
//        monthlyPayment = (principal * (interestRate / 1200.0)) / (1 - Math.pow(1.0 + (interestRate / 1200.0), -1.0 * numMonths));
//        
//        while (monthConsideration <= numMonths)
//        {
//            
//            principalDue = monthlyPayment * Math.pow(1.0 + (interestRate / 1200.0), -1.0 * (1.0 + numMonths - monthConsideration));
//            
//            interestDue = monthlyPayment - principalDue;
//            
//            principalBalance = (interestDue / (interestRate / 1200.0)) - principalDue;
//            
//            totalInterest += interestDue;
//            
//            int monthIntConsideration = (int) monthConsideration;
//            
//            System.out.printf("%-8d%-16.2f%-16.2f%-16.2f%-16.2f%-20.2f\n", monthIntConsideration, monthlyPayment, principalDue, interestDue, principalBalance, totalInterest);
//            
//            monthConsideration++;
//            
//        }
            
        /** Question 8 */
        
//        Random rand = new Random();
//        
//        int min = 0;
//        int max = 100 + 1; // max is exclusive, so add 1;
//
//        int currentNumber = 2; // set the first number to check at 2, since we know 0 and 1 are not prime numbers
//        int count = 0; // number of prime numbers found
//
//        boolean isPrime = false; // boolean flag to check for a primeness of a number
//
//        int n = rand.nextInt(max - min) + min;
//
//        System.out.println("First " + n + " prime numbers: \n");
//
//        while (count <= n) // Repeat while the number of prime numbers found is less than the amount that is wanted
//        {
//
//            for (int i = 2; i <= currentNumber; i++)
//            {
//                isPrime = true; // Assume the current number IS a prime number
//
//                if (currentNumber % i == 0 && i != currentNumber)
//                {
//
//                    isPrime = false; // When the current number is found to be divisible by something that is not itself, it is NOT a prime number
//                    break;
//
//                }
//
//            }
//
//            if (isPrime)
//            {
//
//                System.out.println(currentNumber); // Print the number if it is prime
//                count++; // Increment the number of prime numbers found
//
//            }
//
//            currentNumber++; // Move on to the next number
//
//        }
        
        // Midterm covers until arrays
        
    }
            
}