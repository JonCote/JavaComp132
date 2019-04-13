/*
 * Author: Jonathan Cote c0446292
 * Title: Lab6 Task1
 */
package Lab6;

import java.util.Arrays;


public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] controlArr = {2, -3, 4, -5};
        int[] controlArr2 = controlArr.clone();
        
        arrMul(controlArr);
        System.out.println(Arrays.toString(controlArr));
        
        int[] arr = arrMulReturn(controlArr2);
        System.out.println(Arrays.toString(arr));
        
    }//end of main
        
    /**
     * @param arr
     * Purpose: multiply array value to value to left over riding with new 
     * values.
     */
    public static void arrMul(int[] arr){
        for(int x = 1; x<arr.length; x++){
            arr[x] = arr[x]*arr[x-1];
            }
            
        }//end of arrMul
    
    /**
     * @param arr
     * @return arr2
     * Purpose: multiply array value without over riding orig array
     */
    public static int[] arrMulReturn(int[] arr){
        int[] arr2 = arr.clone();
            
            arrMul(arr2);
            
        return arr2;
    }//end of arrMulReturn
    
}// end of class
