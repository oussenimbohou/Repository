
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein_barack
 */
public class Pb_66_PlusOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] digits = new int[]{9,8,7,6,5,4,3,2,1,0}; 
        System.out.println("Digits Plus One: "+Arrays.toString(plusOne(digits)));
    }
    private static int[] plusOne(int[] digits) {
        
        int len = digits.length-1;
        do {  
            if(digits[len] < 9){
                digits[len]++;
                return digits;
            }
            digits[len] = 0; 
            len--;
        } while (len>=0);
    
        int[] res = new int [digits.length+1];
        res[0] = 1;
        return res;
    }    
    
}
