/*
 * Author: Jonathan Cote c0446292
 * Title: Lab6 Task1
 */
package Lab6;

import java.util.Scanner;


public class Task1 {
Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] list;
        
        list = arrayBuilder();
        reverseArrayPrint(list);
        
    }//end of main
    
    /**
     * @return array address of numList
     * purpose - build a array of user defined length and store with user
     * int input backwards. 
    */
    public static int[] arrayBuilder(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to input");
        int a = input.nextInt();
        int[] numList = new int[a];
        
        for(int z=0; z<a; z++){
            System.out.println("input number: ");
            numList[z] = input.nextInt();
        }//end of for
        return numList;
    }//end of arrayBuilder
    
    /**
     * @param array
     * purpose - print array backwards to screen 
    */
    public static void reverseArrayPrint(int[] array){
        for(int x = ((array.length)-1); x>=0; x--){
            System.out.print(array[x]+ " ");
        }//end of for
    }//end of reverseArrayPrint
}//end of class
