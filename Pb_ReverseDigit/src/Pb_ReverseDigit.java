/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein_barack
 */
public class Pb_ReverseDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Reverse a Digit: "+reverseDigit(-1));
    }
    private static int reverseDigit(int num){
        int sign  = 1;
        int reverse = 0;
        if(num == 0) return 0;
        if(num < 0){
            num = -num;
            sign = -1;
        }
        while(num>0){
            reverse = (reverse*10)+(num%10);
            num = num/10;
        }
        return sign*reverse; 
    }
    
}
