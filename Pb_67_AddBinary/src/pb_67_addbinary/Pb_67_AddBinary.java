/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_67_addbinary;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author hussein_barack
 */
public class Pb_67_AddBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Output: "+binaryAddition("1000","11"));
        
    }
    private static String addBinary(String a, String b) {
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();
        System.out.println("first: "+Arrays.toString(first)+" second: "+Arrays.toString(second));
        System.out.println("first length: "+first.length+" second length: "+second.length);
        ArrayList<Character> sum = new ArrayList<>();
        int max = (first.length >= second.length) ? first.length : second.length;
        char[] minArr;
        if(max == first.length){
            minArr = second; 
            for(char e: first) sum.add(e);
        }else{
            minArr = first;
            for(char e: second) sum.add(e);
        }
        int min = minArr.length,i = 1;
        System.out.println("Sum1: "+sum);
        System.out.println("minArr: "+Arrays.toString(minArr));
        while(max - i >= 0){
            if(min - i >= 0){
                if(sum.get(max-i) == '0' && minArr[min-i] == '1'){
                    sum.set(max-i, '1');
                }   
                else if(sum.get(max-i) == '1' && minArr[min-i] == '1'){
                    sum.set(max-i, '0');
                }  
            }
            i++; 
        }
        System.out.println("Sum: "+sum);
        
        return null;
    }
    private static String binaryAddition(String a,String b){
//        int first = Integer.parseInt(a, 2);
//        int second = Integer.parseInt(b, 2);
//        int sum  = first+second;
//        return Integer.toBinaryString(sum);
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1,j = b.length()-1,carry = 0;
        while(i>=0 || j>= 0){
            int sum = carry;
            if(j>=0) sum += b.charAt(j--) - '0';
            if(i>=0) sum += a.charAt(i--) - '0';
            sb.append(sum%2);
            carry = sum/2;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();  
    }  
    
}
