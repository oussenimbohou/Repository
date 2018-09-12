/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_53_maximumsubarray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author hussein_barack
 */
public class Pb_53_MaximumSubArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max Sub Array: "+maxSubArray(nums));
    }
    private static int maxSubArray(int[] nums){
        int sum1;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            int j = i;
            sum1 = 0;
            while(j<nums.length){
                sum1 += nums[j];
                if(sum1 > max) max = sum1;
                j++;
            }
        }
        return max;
    }
    
}
