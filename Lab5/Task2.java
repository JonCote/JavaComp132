/*
 * Author: Jonathan Cote C0446292
 * Title: Lab 5 Task 2
 */
package Lab5;

import java.util.Scanner;

/**
 *
 * @author c0446292
 */
public class Task2 {
    static int sDollars = 0;
    static int sQuarters = 0;
    static int sDimes = 0;
    static int sNickels = 0;
    static int sPennies = 0;
    static boolean sValidChange = true;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //initializing variables
        double money;
        String changeOut;
           
        System.out.println("How much money do you have?");
	money = input.nextDouble();
        
        restock();
        changeOut = makeChange(money);
        
        System.out.print(changeOut);
        
        //invalid change restock and second attempt at change making.
        if(sValidChange == false){
            System.out.println("restocking mechine and trying again");
            restock();
            changeOut = makeChange(money);
            System.out.print(changeOut);
        }
        //print global change left after making change.
        System.out.print("Change left in machine:\n"+"Dollars: "+sDollars+
                "\tQuarters: "+sQuarters+"\tDimes: "+sDimes+"\tNickels: "+
                sNickels+"\tPennies: "+sPennies+"\n");
    }//end of main
   
    /**
     * @param money
     * @return String change
     * purpose take double input and figure out the best change for input 
     * if insufficient change set sValidChange to false to prompt 
     * restock in main.
     */
    public static String makeChange(double money){
        
        int cents, dollar , quarters , dimes , nickels , pennies;
        int remainder;
        String change;
        
        /* calculate the change */
        cents = (int)(money*100);

        dollar = cents / 100; 
        remainder = cents % 100;

        quarters = remainder / 25;
        remainder = remainder % 25;

        dimes = remainder/ 10;
        remainder = remainder% 10;

        nickels = remainder/ 5;
        pennies = remainder % 5;
        
        //sent to checkChange to verify if there is enought global change
        boolean validChange = checkChange(dollar, quarters, dimes, nickels,
                pennies);
        //true: set change as a string with change amounts for input
        //false: set change as error msg and sValidChange false to prompt
        //restock in main.
        if(validChange == true){
            change = ("Your change is: \n"+dollar+" Dollars \n"+quarters
                    +" Quarters \n"+dimes+" Dimes \n"+nickels
                    +" Nickels \n"+pennies
                    +" Pennies \n");
        }else{
            change = "not enough change \n";
            sValidChange = false;
        }
        
        return change;
    }//end of makeChange
     
    /**
     * @param d
     * @param q
     * @param di
     * @param n
     * @param p
     * @return boolean validChange
     * purpose verify that enough global change is present, if true: 
     * subtract change amount from global change and return true. 
     * if false return false.
     */
    public static boolean checkChange(int d, int q, int di, int n, int p){
        boolean validChange = false;
        
        if((d <= sDollars) && (q <= sQuarters) && (di <= sDimes) &&
                (n <= sNickels) && (p <= sPennies)){
            validChange = true;
            sDollars = sDollars - d;
            sQuarters = sQuarters - q;
            sDimes = sDimes - di;
            sNickels = sNickels - n;
            sPennies = sPennies - p;
        }
        return validChange;
    }// end of checkChange
    
    /**
     * purpose Stock global change values.
     */
    public static void restock(){
        sDollars = sDollars + 50;
        sQuarters = sQuarters + 5;
        sDimes = sDimes + 5;
        sNickels = sNickels + 5;
        sPennies = sPennies + 5;     
    }//end of restock
}
