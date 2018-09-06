
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
public class Pb_PartingTheArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("Even Odd elet Array: "+Arrays.toString(evenOdd1(nums)));
    }
    private static int[] evenOdd(int[] nums){
        int len = nums.length;
        int left,right;
        for(int i = 0;i<len;i++){
            left = i;
            right = len - 1;
            while(left<right){
                while(nums[left]%2 == 0) left++;
                while(nums[right]%2 == 1)right--;
                if(left<right){
                    swap(nums,left,right);
                    left++;
                    right--;
                }
            }
            
        }
        return nums;
    }
    private static int[] evenOdd1(int[] nums){
        int j = -1,len = nums.length;
        for(int i = 0;i<len;i++){
            if(nums[i]%2 == 0){
                j++;
                swap(nums, i, j);
            }
        }
        return nums;
        
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i]  = nums[j];
        nums[j]  = temp;
    }
    
}
