package tutorial4;

public class Tutorial4
{

    public static void main(String[] args)
    {
        
        /** Question 1 */
        
        int n = 1;
        
        while (true)
        {
            
            if (Math.pow(n, 3) < 2000)
            {
                
                n++;
                
            } else {
                
                break;
                
            }
            
        }
        
        System.out.println("The largest integer, n, where n^3 is less than 2000 is " + n + ". The value of " + n + "^3 is: " + (int) Math.pow(n, 3));
        
    }
    
}