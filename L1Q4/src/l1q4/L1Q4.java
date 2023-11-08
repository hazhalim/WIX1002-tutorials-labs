package l1q4;

public class L1Q4
{

    public static void main(String[] args)
    {
        
        // Initialise 2D array to store data from table
        // First column: Month of the 2016 year from table
        // Second column: Sales value in RM
        // Third column: Number of asterisks to be printed on bar chart
        int dataArray[][] = 
        {
            
        
            {1, 2500, 0},
            {2, 1600, 0},
            {3, 2000, 0},
            {4, 2700, 0},
            {5, 3200, 0},
            {6, 800, 0}

        };
        
        // Number of asterisks to be printed is sales value divided by 100
        for (int i = 0; i < dataArray.length; i++)
        {
            
            dataArray[i][2] = dataArray[i][1] / 100;
            
        }
        
        
        System.out.println("""
                          
                           =================================================
                           ====== Bar Chart: Total Sales of Product A ======
    
                           """);
        
        printData("January 2016   | ", dataArray[0][2]);
        printData("February 2016  | ", dataArray[1][2]);
        printData("March 2016     | ", dataArray[2][2]);
        printData("April 2016     | ", dataArray[3][2]);
        printData("May 2016       | ", dataArray[4][2]);
        printData("June 2016      | ", dataArray[5][2]);
        
        System.out.println("""
                           
                           =================================================
                           """);
        
        
    }
    
    // Method to print each month's data
    private static void printData(String monthYear, int number)
    {
        
        System.out.print(monthYear);
        
        // Looping on printing the asterisks based on the magnitude of sales value
        for (int i = 0; i < number; i++)
        {
            
            System.out.print("*");
            
        }
        
        System.out.println();
        
    }
    
}