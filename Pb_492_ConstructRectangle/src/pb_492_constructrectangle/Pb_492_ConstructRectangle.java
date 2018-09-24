/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_492_constructrectangle;

import java.util.Arrays;

/**
 *
 * @author hussein_barack
 */
public class Pb_492_ConstructRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Rectangle : "+Arrays.toString(ConstructRectangle(16)));
    }
    private static int[] ConstructRectangle(int n){
        int a = 2;
        int[] temp = new int[2];
        if(n == 1){
            temp[0] = 1;
            temp[1] = 1;
        }
        while(a<=Math.sqrt(n)){
            if(n%a == 0){ 
                temp[0] = n/a;
                temp[1] = a;
            }
            a++;
        }
        return temp;
    }    
    
}
