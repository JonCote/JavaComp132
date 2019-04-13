/*
Author: Jonathan Cote C0446292
Title: Lab 4 Task 1
 */
package Lab4;

import java.util.Scanner;


public class Task1 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Initializing variables
        int lottoNum = 0;
        int userNum = 0;
        int prize = 10000;
        int userWin = 0;
        int count = 0;
        boolean loopControl = false;
        String cControl = "";
        String scaninput = "";
       
        //Random num generator
        lottoNum = (int)(Math.random()*100);
       
        //Asking if player wants to play
        System.out.println("would you like play? Y/Yes to continue" 
                +"or Q/Quit to quit");
        cControl = input.next();
        cControl = cControl.toUpperCase();
        if("YES".equals(cControl) || "Y".equals(cControl))
            loopControl = true;
        
        //loop the keeps going tell user guesses right number or cash hits 0
        while(prize > 0 && loopControl == true){
          
            //developing control for loop to let user quit at any time
            System.out.println("make a two number guess: [or q to quit]");
            //takes string input
            scaninput = input.next();
                //check if input is a Q inorder to quit the game
                if("q".equals(scaninput)){
                    loopControl = false;
                }else{//if user inputs a number play the game
                    //convert string input into int for game
                    userNum = Integer.parseInt(scaninput);
                    
                    //check if 2 digit input
                    if(userNum >= 0 && userNum <= 99){
                        count++;
                        //game bundle.
                        if(lottoNum == userNum){
                            userWin = prize;
                            loopControl = false;
                            System.out.println("the number is: "+lottoNum
                                    +" congratz");
                        }else if(prize > 1000){
                            prize -= 1000;
                        }else{
                            prize -= 100;
                        }
                        if(userNum < lottoNum){
                          System.out.println("you guessed to low try again");
                        }else if(userNum > lottoNum){
                          System.out.println("you guessed to high try again");
                        }
                    }//if to check in number is 2 digits
                    else System.out.println("Invade input");
            }//continue if statment
            
            }//while loop
        
        System.out.println("you have won: "+userWin+ "\nyou took: "+count
                +" guesses");
    }//end of main
    
}
