/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_58_lengthofthelastword;

/**
 *
 * @author hussein_barack
 */
public class Pb_58_LengthOfTheLastWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "Hello World,Nice coding";
        System.out.println("Last word length: "+lengthOfLastWord(s));
    }
    private static int lengthOfLastWord(String s){
        String[] charString = s.split(" ");
        if(s.trim().length() == 0) return 0;
        return charString[charString.length-1].length();
    }
}
