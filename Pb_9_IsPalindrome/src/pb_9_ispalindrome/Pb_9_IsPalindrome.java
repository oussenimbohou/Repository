/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_9_ispalindrome;

/**
 *
 * @author hussein_barack
 */
public class Pb_9_IsPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Is Palindrome: "+isPalindromeUsingArray(432161234));
    }
    //Problem 9
    private static boolean isPalindrome(int num){
        if(num<0) return false;
        return num == reverseNumber(num);
    }     
    private static int reverseNumber(int num){
    int res = 0;
    int sign = 1;
    if(num<0){
        sign = -1;
        num = - num;
    }
    while(num > 0){
        if(res<Integer.MAX_VALUE/10){
            res = res*10 + num%10;
            num /= 10;
        }else return 0;
    }
    return sign * res;
}
    private static boolean isPalindromeUsingArray(int str){
        char[] charArr = String.valueOf(str).toCharArray();
        int left = 0;
        int right = charArr.length-1;
        while(left<right){
            if(charArr[left] == charArr[right]){
                left++;
                right--;
            }else return false; 
        }
        return true;  
    }   
    
}
