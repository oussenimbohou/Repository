/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_400_nthdigit;

/**
 *
 * @author hussein_barack
 */
public class Pb_400_NthDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nth Digit: "+nthDigit(1000));
    }
    private static int nthDigit(int num){
        long n = num;
        long start = 1,len = 1,count = 9;
        while(n > len*count){
            n = n - len*count;
            len++;
            count = count*10;
            start = start*10;
        }
        start = start + (n-1)/len;
        return String.valueOf(start).charAt((int)((n-1)%len))-'0';
    }
    
}
