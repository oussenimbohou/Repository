
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein_barack
 */
public class Pb_CharacterArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] c = new char[]{'a','b','c'};
        System.out.println("Char Array: "+Arrays.toString(charArray(c, 1, 0)));
    }
    private static char[] charArray(char[] a, int start, int len){
        int l = a.length;
        if(l == 0 || start<0 || len<0 || len + start -1  >= l) return null;
        char[] arr = new char[len];
        if(len == 0 && start<l) return new char[0];
        for(int i = start,j=0;j<len;i++,j++){
            arr[j] = a[i];
        }
        return arr;
    }
    
}
