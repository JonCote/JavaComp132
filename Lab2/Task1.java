/*
Author: Jonathan Cote c0446292
Title: Lab 2 part 1
 */
package Lab2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Task1 {
    
    public static void main(String[] args) {
        //initalizing scanner/value cleaner function
        Scanner input = new Scanner(System.in);
        //for formating decimal for easier $ value  
        DecimalFormat numberFormat = new DecimalFormat("#.00"); 
        //initalizing variables
        String userName = "";
        byte creditHours = 0;
        float feePerCH = 0;
        float totTuition = 0;
        
        //Taking inputs for variables
        System.out.println("What is your name?");
        userName = input.nextLine();

        System.out.println("How many credit hours are you taking this "
                + "semester?");
        creditHours = input.nextByte();

        System.out.println("What is the fee per credit hour?");
        feePerCH = input.nextFloat();

        // Calculating total truition cost
        totTuition = creditHours * feePerCH;
        
        //throwing output to console
        System.out.println("your name is: " + userName + ", You are taking " 
                + creditHours + " credit hours this semester, " 
                 + "You will have a total tuition fee of $" 
                + numberFormat.format(totTuition) + " this semester.");       
    }// end of main
}// end of class
