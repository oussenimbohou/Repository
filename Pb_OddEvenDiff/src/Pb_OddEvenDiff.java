/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein_barack
 */
public class Pb_OddEvenDiff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[]{4,1,2,3};
        System.out.println("Odd Even Diff: "+oddEvenDiff(nums));
    }
    private static int oddEvenDiff(int[] nums){
        int X = 0,Y = 0;
        if(nums.length == 0) return 0;
        for(int e:nums){
            if(e%2 != 0) X += e;
            else Y += e;
        }
        return X - Y;
    }
    
}
