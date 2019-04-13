/*
Author: Jonathan Cote c0446292
Title: Lab 3 task 2
*/
package Lab3;
//import tools
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        //Initialize Scanner
        Scanner input = new Scanner(System.in);
        
        //Initalizing variables
        float userInput = 0; //use of a float to allow .00 numbers
        boolean loopControl = false;
        
        //building loop to restart program if invalid input.
        while(loopControl == false){
           //Prompt user for input within range 0-100 and assigne to userInput
            System.out.println("Input a number within 0-100 ");
            userInput = input.nextFloat();
            
            //Check if input is within 0-100 range
            if(userInput >= 0 && userInput <= 100){
                userInput = userInput * 2;
                loopControl = true; //end loop after calculation.
            }else{
                System.out.println("You entered a value outside of the range"
                        + " 0-100.");
            }   
        }//end of loop
        
        //Throw value to console
        System.out.println("your result is: "+userInput);  
    }//end of main
    
}
