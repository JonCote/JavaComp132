/*
Author: Jonathan Cote C0446292
Title: Lab 4 task 2
 */
package Lab4;

import java.util.Scanner;

public class Task2 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //initalize variables
        int fibNum1 = 1;
        int fibNum2 = 1;
        int fibNum3 = 0;
        
        System.out.print(fibNum1+","+fibNum2);
        
        //loop to get up to 28000 for fib3.
        for(int count = 0; count < 21; count++){
            fibNum3 = fibNum1 + fibNum2;
            fibNum1 = fibNum2;
            fibNum2 = fibNum3;
            
            System.out.print(","+fibNum3);
            
            
        }//end of loop
       
    }//end of main
    
}
