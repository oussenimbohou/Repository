/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_866_primepalindrome;

/**
 *
 * @author hussein_barack
 */
public class Pb_866_PrimePalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  11101010
        System.out.println("Smallest Prime Palindrome: "+primePalindrome(95));
    }

    private static int primePalindrome(int N) {
        if (8 <= N && N <= 11) return 11;
        for (int x = 1; x < 100000; x++) {
            String s = Integer.toString(x);
            String r = new StringBuilder(s).reverse().toString().substring(1);
            int y = Integer.parseInt(s + r);
            if (y >= N && isPrime(y)) return y;
        }
        return -1;
    }   
   
   private static boolean isPrime(int num) {
       if(num<2) return false; 
       if(num == 2) return true; 
       if(num%2 == 0) return false;
        for(int i = 3;i*i<=num;i = i+2)
            if(num%i == 0) return false;
        return true;
    }   
    
}
