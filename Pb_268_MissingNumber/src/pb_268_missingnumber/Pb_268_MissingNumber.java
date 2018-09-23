/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_268_missingnumber;

import java.util.Arrays;

/**
 *
 * @author hussein_barack
 */
public class Pb_268_MissingNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[]{3,0,1,4,2,6};
        System.out.println("missing number: "+missingNumber(nums));
    }
    private static int missingNumber(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i+1] != nums[i]+1) return nums[i]+1;
        }
        if(nums[0] != 0) return 0;
        return nums[nums.length-1]+1;        
    }
    
}
