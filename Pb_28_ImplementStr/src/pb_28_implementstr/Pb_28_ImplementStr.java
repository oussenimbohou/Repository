/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_28_implementstr;

/**
 *
 * @author hussein_barack
 */
public class Pb_28_ImplementStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Substring: "+strStr("plipli", "li"));
    }
   private static int strStr(String haystack,String needle){
        int index = 0;
        int flag = -1;
        if(needle.length() == 0) return 0;
        for(int i = 0;i<haystack.length();i++){
            if(needle.length()+i <= haystack.length())
                if(haystack.substring(i, needle.length()+i).equals(needle)){
                    flag = 1;
                    index = i;
                    break;
                }
        }
        if(flag != 1) return -1;
        return index; 
        
    }    
}
