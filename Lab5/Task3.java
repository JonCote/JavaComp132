/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.Scanner;

/**
 *
 * @author c0446292
 */
public class Task3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int lottoNum = lottoNumGen();
        int winScore = 0;
        int winnings;
        int playCount = -1;
        
        while(winScore == 0 || playCount == 100){
            int userGuess = userGuessCollector(playCount);
            winScore = lottoCheck(userGuess, lottoNum, playCount);
            playCount++;
         }
        
        switch(winScore){
            case 1: 
                winnings = (1000 - (playCount * 100));
                break;
            case 2:
                winnings = (3000 - (playCount * 100));
                break;
            case 3:
                winnings = (10000 - (playCount * 100));
                break;
            default:
                winnings = 0;
        }
        System.out.println("You won: "+winnings+"\nLotto Number: "+lottoNum);
        
    }//end of main
    
    /**
    * @return int lottoNum
    * Purpose: generate random number.
    */
    public static int lottoNumGen(){
        int lottoNum = (int)(Math.random()*100);
        return lottoNum;
    }//end of lottoNum
    
    /**
    * @param count
    * @return int userGuess
    * Purpose: Collect user input for lotto guess and validate proper input
    */
    public static int userGuessCollector(int count){
        Scanner input = new Scanner(System.in);
        
        if(count >= 0)
            System.out.println("Wrong numbers, Input 2 digits to try again");
        else
            System.out.println("Input a 2 digit number for the lotto");
        
        int userGuess = input.nextInt();
        
        while(userGuess < 0 || userGuess > 99){
            System.out.println("Invade input try again:");
            userGuess = input.nextInt();
        }//end of while loop
        
        return userGuess;
    }//end of userGuess
    
    /**
    * @param guess
    * @param lotto
    * @param count
    * @return int lottoCheck
    * Purpose: check lotto numbers with user numbers to determine winnings.
    */
    public static int lottoCheck(int guess, int lotto, int count){
        int lottoCheck = 0;
        int g1 = guess / 10;
        int g2 = guess % 10;
        int l1 = lotto / 10;
        int l2 = lotto % 10;
        
        if((guess == lotto) && (count < 100)){
            lottoCheck = 3;
        }else if(((l1 == g1 || l1 == g2) && (l2 == g1 || l2 == g2) && 
                    (g1 != g2 && l1 != l2)) && (count < 30)){
            lottoCheck = 2;
        }else if ((l1 == g1 || l1 == g2 || l2 == g1 || l2 == g2) && 
                    (count < 10)){
            lottoCheck = 1;
        }
        
        return lottoCheck;
    }
}//end of class
