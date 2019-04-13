//Author: Jonathan Cote c0446292
//Title: Lab 2 part 2
package Lab2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //formating of decimals for $ values.
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        //Manipulated variables
        float inputAmount = 0;
        int cents = 0;
        int dollars = 0;
        byte quarters = 0;
        byte dimes = 0;
        byte nickels = 0;
        /// Static values
        byte vCent = 100;
        byte vQuarter = 25;
        byte vDime = 10;
        byte vNickel = 5;
        
        // Taking user input and cleaning up input
        System.out.println("How much money would you me to tell you the"
                + " largest denominations possible?");
        inputAmount = input.nextFloat();
        //to deal with cases where input is more then 2 decimal place.
        numberFormat.format(inputAmount); 
        // doing math on input to get return values
        cents = (int)(inputAmount * vCent);
        dollars = (int)cents / vCent;
        quarters = (byte)(cents % vCent / vQuarter);
        dimes = (byte)(cents % vCent % vQuarter / vDime);
        nickels = (byte)(cents % vCent % vQuarter % vDime / vNickel);
        cents = cents % vCent % vQuarter % vDime % vNickel; 
        // throwing return values to console
        System.out.println("Dollars: "+dollars+"\nQuarters: "+quarters
            +"\nDimes: "+dimes+"\nNickels: "+nickels+"\nCents: "+(int)cents);         
    } 
}
