/*
Author: Jonathan Cote C0446292
Title: Lab 3 task 2
 */
package Lab3;

import java.util.Scanner;

public class Task2 {

   
    public static void main(String[] args) {
       //initializing tools
        Scanner input = new Scanner(System.in);
        
       //Initializing variables.
        byte lottoNum = 0;
        byte userNum = 0;
        int userWinning = 200; // start game with $100
        byte guess1 = 0;
        byte guess2 = 0;
        byte lotto1 = 0;
        byte lotto2 = 0;
        boolean cOut = false;
        boolean loopControl = false;
        byte userVali;
       
       //print starting money
       System.out.println("you have $"+userWinning);
       //game loop
       while(loopControl == false){
          //ask user if he would like to keep playing
            if(userWinning >=100){
                System.out.println("Would you like to try your hand at the lotto for $100? input 1 to buy, 2 to not buy");
                userVali = input.nextByte();

                if(userVali == 1){

                    //Generate random lotto number
                      lottoNum = (byte)(Math.random()*100);
                      lotto1 = (byte)(lottoNum / 10);
                      lotto2 = (byte)(lottoNum % 10);

                    //Prompt user for input and store input.
                      System.out.println("Input a 2 digit number for the lotto.");
                      userNum = input.nextByte();
                      if(userNum >= 0 && userNum <= 99){
                        guess1 = (byte)(userNum / 10);
                        guess2 = (byte)(userNum % 10);
                        userWinning = userWinning - 100;
                        cOut = false;
                      }else{
                          System.out.println("Invalid number");
                          cOut = true;
                      }
                    if(cOut == false){
                    //lotto number to console
                      System.out.println("lotto number: "+lotto1+lotto2);

                    //build if statments to check the input to random number for lotto
                      if(userNum == lottoNum){
                          userWinning = userWinning + 10000;
                      }else if((lotto1 == guess1 || lotto1 == guess2) && (lotto2 == guess1 || lotto2 == guess2)){
                          userWinning = userWinning + 3000;
                      }else if(lotto1 == guess1 || lotto1 == guess2 || lotto2 == guess1 || lotto2 == guess2){
                          userWinning = userWinning + 1000;
                      }
                    //print winnings so far
                      System.out.println("Current Winnings: "+userWinning);
                    }
                }//if userVali
                else if(userVali != 2){
                    System.out.println("Invalid input");
                }else{
                    loopControl = true; //get out of loop if user does not want to play again
                }
            }//if check if player has more then $100
            else{
                loopControl = true; //get out of loop if user does not have $100 to buy ticket.
            }
         
       }//while loop
       
       //print userWinnings
       System.out.println("Thank you for playing LottoLots your Winnings: "+userWinning);
    }
    
}
