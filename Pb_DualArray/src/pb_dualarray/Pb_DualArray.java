/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_dualarray;

/**
 *
 * @author hussein_barack
 */
public class Pb_DualArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[]{1,2,2,1,3,0};
        System.out.println("Dual Array: "+isDual(nums));
    }
    private static int isDual(int[] nums){
        if(nums.length == 0 && nums.length<4) return 0;
        if(nums.length%2 == 1) return 0;
        int sum = nums[0] + nums[1];
        for(int i = 2;i<nums.length-1;i=i+2)
            if( sum == nums[i] + nums[i+1]){
                sum = nums[i] + nums[i+1];
            }else return 0;
        return 1;
        
    }
    
}
