/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_415_addstring;

/**
 *
 * @author hussein_barack
 */
public class Pb_415_AddString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Decimal Addition: "+addString("194","38"));
    }

    private static String addString(String a,String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1,j = b.length()-1,carry = 0;
        while(i>=0 || j>= 0){
            int sum = carry;
            if(i>=0) sum += a.charAt(i--) - '0';
            if(j>=0) sum += b.charAt(j--) - '0';
            sb.append(sum%10);
            carry = sum/10;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();  
    }     
    
}
