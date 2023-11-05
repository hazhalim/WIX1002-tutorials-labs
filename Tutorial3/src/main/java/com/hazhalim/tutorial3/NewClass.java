package com.hazhalim.tutorial3;

import java.util.Scanner;

public class NewClass
{
    
    public static void main(String[] args)
    {
        
        Scanner keyboard = new Scanner(System.in);
        
        String day = keyboard.next();
        
        switch(day)
        {
            
            case "Sunday":
            {
                System.out.println("0");
                break;
            }
            
            case "Monday":
            {
                System.out.println("1");
                break;
            }
            
            case "Tuesday":
            {
                System.out.println("2");
                break;
            }
            
            case "Wednesday":
            {
                System.out.println("3");
                break;
            }
            
            case "Thursday":
            {
                System.out.println("4");
                break;
            }
            
            case "Friday":
            {
                System.out.println("5");
                break;
            }
            
            case "Saturday":
            {
                System.out.println("6");
                break;
            }
            
            default:
            {
                System.out.println("Error! Only input the days of the week, please.");
		break; // good practice to put break here anyway
            }

            
        }
        
    }
    
}