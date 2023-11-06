package week.pkg5.lectureexercises;

import java.util.Scanner;

public class Week5Lectureexercises
{

    public static void main(String[] args)
    {
        
        /** Week 5 Lecture Exercises */
        
        /*
        
        Write a Java program to track the coordinate of an object after a sequence of
        moves. Figure below shows the system coordinate used. The program will prompt
        the user to enter the X and Y coordinates as well as the moves. The move is
        represented by L (Left), R (Right), U (Up) and D (Down). (Copy the Main.java
        answers file to your exam account directory and rename it as
        [matricNumberQ1.java], example: WEK150001Q1.java)
        
        */
        
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        
        for (int i = 0; i < myNumbers.length; ++i)
        {
            
            for (int j = 0; j < myNumbers[i].length; ++j)
            {
                
                System.out.println(myNumbers[i][j]);
                
            }
            
        }
        
        System.out.println("----------------------------");
        
        int[] data = { 41, 62, 7, 1, 19, 77, 99, 8, 20, 11 };
        
        int searchKey = 0;
        
        boolean found = false;
        
        for (int cnt = 0; cnt < data.length; cnt++)
        {
            
            if (data[cnt] == searchKey)
            {
                
                found = true;
                
                System.out.println(searchKey + " is at data[" + cnt + "]...");
                
                if (found)
                {
                    
                    break;
                    
                }
                
            }
            
        }
        
        if (!found)
        {
            
            System.out.println(searchKey + " could not be found in int array data[" + data.length + "]...");
            
        }
        
        int[] binaryData = { 2, 7, 10, 12, 17, 20, 25, 35, 54, 81 };
        
        int low = 0;
        int high = binaryData.length - 1;
        int middle;
        
    }
    
}