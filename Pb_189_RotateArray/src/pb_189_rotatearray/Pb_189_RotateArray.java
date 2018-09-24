/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_189_rotatearray;

import java.util.Arrays;

/**
 *
 * @author hussein_barack
 */
public class Pb_189_RotateArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] num3 = new int[] {7,6,5,4,3,2,1};
        System.out.println("Rotate Array : "+Arrays.toString(num3));
    }
    private static int[] rotateArray(int[] a,int k){
        if(a == null) return null;
        int len = a.length;
        int[] temp = new int[k];
        for(int i = k,j=0;i>0;i--,j++){
            temp[j] = a[len-i];
        }
        int[] finalArray = new int[len];
        for(int i = 0,j=0;i<len;i++){
            if(i<k) finalArray[i] = temp[i];
            else{
                finalArray[i] = a[j];
                j++;
            }
        }
        return finalArray;
    }    
    
}
