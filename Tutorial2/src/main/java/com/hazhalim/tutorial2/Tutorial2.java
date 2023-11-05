package com.hazhalim.tutorial2;

import java.util.Scanner;

public class Tutorial2
{

    public static void main(String[] args)
    {
        
        /** Question 1 */
        
        System.out.print("Faculty of Computer Science");
        System.out.print(" and Information Technology"); // √
        
        System.out.println("\n");
        
        System.out.println("Faculty of Computer Science\n and Information Technology"); // √
        
        System.out.println("");
        
        /** Question 2 */
        
        System.out.println("\"SDN\" - Software-defined networking"); // √
        System.out.println("");
        
        /** Question 3 – Correct the Errors */
        
        // a) System.Println("Java Programming");
        
        System.out.println("Java Programming"); // √
        System.out.println("");
        
        // b) System.in.println("Introduction to Java!");
        
        System.out.println("Introduction to Java!"); // √
        System.out.println("");
        
        // c) System.out.println("\t is the horizontal tab character");
        
        System.out.println("\\t is the horizontal tab character"); // √
        System.out.println("");
        
        // d) system.out.println("Java is case sensitive!");
        
        System.out.println("Java is case sensitive!"); // √
        System.out.println("");
        
        /** Question 4 */
        
        int matricsNumber; // actually, use String datatype since those kinds of numbers can include 0 at the front, in which it will be lost when int/double/float is used
        
        double pi; // if using float, put 'f' behind number similar to float, NOT APPLICABLE TO DOUBLE
        // also, pi is a constant, so this should be a constant i.e. final double PI = 3.14159;
        // Also, constant variables should be all capital according to naming convention
        
        boolean M = false; // √
        
        long P = 8800000000L; // (√) long is used as a pre-fix to int as the value is larger than what int supports, add 'L' to the back of the number to show it is a long
        
        char letter = 'U'; // (√) single quote because only one character, string is double quotes
        
        final String PRO = "Java"; // √
        
        /** Question 5  – Correct the Statements */
        
        /* a)
        
        final double AMOUNT = "32.5";
        AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT);
        
        */
        
        double AMOUNT = 32.5; // Remove the final keyword so the variable can be changed post-intialisation, ALSO REMOVE QUOTES
        AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT);
        System.out.println("");
        
        /* b)
        
        string chapter = 'Summary';
        System.out.println(chapter);
        
        */
        
        String chapter = "Summary"; // Capitalise "string" and use double quotes for the value
        System.out.println(chapter);
        System.out.println("");
        
        /* c)
        
        int num;
        ++num++;
        num1 = num;
        
        */
        
        int num = 0, num1; // Correctly initialise num, declare num1
        ++num; // Use ++ operator only once either before or after the variable
        num1 = num;
        
        /* d)
        
        int num2 = 3000;
        System.out.printf("%4.2f\n", num2);
        
        */
        
        float num2 = 3000f; // Change variable data type to float, remember to put f behind float
        System.out.printf("%4.2f\n", num2);
        
        /* e)
        
        String contact;
        Scanner keyboard = new Scanner(System.out);
        contact = keyboard.nextLine();
        
        */
        
        String contact;
        Scanner keyboard = new Scanner(System.in); // System.in instead of System.out (√)
        contact = keyboard.nextLine();
        
        System.out.println("");
        
        /** Question 6 */
        
        double diameter, circumference;
        
        System.out.println("Enter diameter: ");
        
        diameter = keyboard.nextDouble();
        
        circumference = 2 * Math.PI * (diameter / 2); // Circumference of a circle = 2*pi*r
        // Girl!! circumference is also = π * d
        
        System.out.println("");
        System.out.printf("The circumference of the circle is : %.3f", circumference);
        
        System.out.println("\n");
        
        /** Question 7 */
        
        double inches, meters;
        
        System.out.println("Enter value in inch: ");
        
        inches = keyboard.nextDouble();
        
        meters = (inches * 2.54) / 100;
        
        System.out.printf("%.2f inches = %.2f meters", inches, meters);
        
        System.out.println("");
        
    }
    
}