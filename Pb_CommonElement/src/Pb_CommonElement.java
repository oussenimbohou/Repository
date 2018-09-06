
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
public class Pb_CommonElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int first[] = new int[]{1, 8, 3, 2, 6};
        int second[] = new int[]{2, 6, 1};
        System.out.println("Common Element: "+Arrays.toString(commonElt(first, second)));
    }
    private static int[] commonElt(int[] first,int[] second){
        int[] a,b;
        if(first == null || second == null) return null;
        if(first.length == 0 || second.length == 0) return new int[0];
        int min = (first.length<second.length) ? first.length : second.length;
        if(first.length < second.length){
            a = first;
            b = second;
        }else{
            a = second;
            b = first;
        }
        int k = 0;
        int[] temp = new int[min];
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<b.length;j++){
                if(a[i] == b[j]){
                    temp[k] = a[i];
                    k++;
                }
            }
        }
        int[] t = new int[k];
        System.arraycopy(temp, 0, t, 0, k);
        return t;
    }
    
}
