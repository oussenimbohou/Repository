/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_125_validpalindrome;

/**
 *
 * @author hussein_barack
 */
public class Pb_125_ValidPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Valid: "+isPalindrome("A man, a plan, a canal: Panama"));
    }
    private static boolean isPalindrome(String s){
        String str = s.toLowerCase();
        String regex = "[a-z0-9]+";
        StringBuilder string = new StringBuilder("");
        char[] array = str.toCharArray();
        for(char e:array){
            if(String.valueOf(e).matches(regex))
                string.append(e);
        }
        System.out.println("Valid String: "+string);
        return string.toString().equalsIgnoreCase(string.reverse().toString());
    }
    
}
