
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
public class Pb_1_TwoSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[]{2,7,11,15};
        System.out.println("Two Sum: "+Arrays.toString(twoSum(nums, 9)));
    }
    private static int[] twoSum(int[] nums,int target){
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    
}
