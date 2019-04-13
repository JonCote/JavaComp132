/*
Author: Jonathan Cote C0446292
Title: Lab 5 Task 1
 */
package Lab5;

import java.util.Scanner;


public class Task1 {

  
    public static void main(String[] args) {
        //building tools
        Scanner input = new Scanner(System.in);
        
        //initialize variables
        int teamNum = 0;
        String teamName;
        
        //promp user for team number
        System.out.println("What is your team number: ");
        teamNum = input.nextInt();
        
        //pass num into team finder method
        teamName = find_My_Team(teamNum);
        
        //print team assigned
        System.out.println(teamName);
        
      
    }//end of main

    /**
     * @return String teamName
     * @param num
     * purpose - figures out team associated with input num.
    */
public static String find_My_Team(int num){
   
    String teamName;

    switch(num){
        case 1: case 2: case 3: case 6:
            teamName = "you are in the Junior league";
            break;
        case 8: case 9:
            teamName = "you are in the Amateur league";
            break;
        case 4: case 7: case 11:
            teamName = "you are in the Special league";
            break;
        case 5: case 10: case 12: case 14:
            teamName = "you are in the Major league";
            break;
        default:
            teamName = "Error: Unassigned Number";
            break;
        }
    return teamName;
}//end of find_My_Team
    
}

