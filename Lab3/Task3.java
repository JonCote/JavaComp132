/*
Author: Jonathan Cote C0446292
Title: Lab 3 Task 3
 */
package Lab3;

import java.util.Scanner;


public class Task3 {

  
    public static void main(String[] args) {
        //building tools
        Scanner input = new Scanner(System.in);
        
        //initialize variables
        byte teamNum = 0;
        
        //promp user for team number
        System.out.println("What is your team number: ");
        teamNum = input.nextByte();
        
        //switch to figure out team name
        switch(teamNum){
                case 1: case 2: case 3: case 6:
                    System.out.println("you are in the Junior league");
                    break;
                case 8: case 9:
                    System.out.println("you are in the Amateur league");
                    break;
                case 4: case 7: case 11:
                    System.out.println("you are in the Special league");
                    break;
                case 5: case 10: case 12: case 14:
                    System.out.println("you are in the Major league");
                    break;
                default:
                    System.out.println("the number you inputed is unassigned");
                    break;
                        }//switch teamNum
        
    }
    
}
