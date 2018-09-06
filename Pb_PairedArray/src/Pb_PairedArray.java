/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein_barack
 */
public class Pb_PairedArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[]{1,4,1,4,5,6};
        System.out.println("Is Paired N array: "+isPairedN(nums, 5));
    }
    private static int isPairedN(int[] a,int n){
        if(a == null) return 0;
        if(a.length == 0) return 0;
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]+a[j] == n && i+j == n) return 1;
            }
        }
        return 0;
    }
    
    
}
