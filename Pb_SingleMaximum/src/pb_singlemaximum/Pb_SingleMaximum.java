/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_singlemaximum;

/**
 *
 * @author hussein_barack
 */
public class Pb_SingleMaximum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[]{1,2,3,4,4,5,5};
        System.out.println("Single Max: "+hasSingleMax(nums));
    }
    private static int hasSingleMax(int[] nums){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        if(nums.length == 0) return 0;
        for(int e:nums){
            if(e>=first){
                second = first;
                first = e;
            }
        }
        if(first == second) return 0;
        return 1;
    }
}
