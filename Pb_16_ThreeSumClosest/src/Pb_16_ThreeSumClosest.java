
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein_barack
 */
public class Pb_16_ThreeSumClosest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[]{-1,2,1,-4};
        System.out.println("Thre Sum Closest: "+threeSumClosest(nums, -3));
    }

    private static int threeSumClosest(int[] nums,int target){
        if(nums == null || nums.length < 3) return -1;
        int comp = Integer.MAX_VALUE;
        int ans = -10;
        Arrays.sort(nums);
        for (int i = 0 ; i < nums.length ; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);
                if (diff < comp){
                    comp = diff; 
                    ans = sum;
                }  
                if (sum==target) return ans;
                if (sum<target) left++;
                else right--;
            }            
        }
        return ans;
            
    }
    
}
