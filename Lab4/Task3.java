/*
Author: Jonathan COte C0446292
Title: Lab 4 Task 3
 */
package Lab4;


public class Task3 {

    public static void main(String[] args) {
 
        //loop
        for(int i = 0; i <= 10; i++){
            //nested loop j<=i controls the pymid shape of output
            for(int j = 0; j <= i; j++){
                
                //if conditions causing rotating x and o in Caps and position.
                if((i+j)%2==0 && i%2==0)
                    System.out.print("X");
                else if((i+j)%2==0)
                    System.out.print("x");
                else if((i+j)%2==1 && i%2==1)
                    System.out.print("O");
                else if((i+j)%2==1)
                    System.out.print("o");
            }//end of nested for loop
            System.out.println("");
        }//end of for loop
        
    }//end of main
    
}
