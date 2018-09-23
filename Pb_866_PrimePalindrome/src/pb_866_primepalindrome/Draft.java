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
public class Draft {

   private static int primePalindrome(int num){
       while(true){
           while(!isPalindrome(num)) num++;
           if(isPrime(num)) return num;
           num++;
       }
   }    
   private static boolean isPalindrome(int num){
       return num == reverseNumber(num);
   }   
   private static int reverseNumber(int number){
        int reverse = 0;
        while( number>0){
            reverse =(reverse*10) + (number%10);
            number = number/10;
        }
        return reverse; 
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
