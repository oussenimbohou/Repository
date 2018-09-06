/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein_barack
 */
public class Pb_CenteredArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[] = new int[]{3, 2, 1, 4, 5};
        System.out.println("Centered Array: "+centeredArray(nums));
    }
    private static int centeredArray(int[] nums){
        int len = nums.length;
        if(len%2 == 0 || len == 0) return 0;
        int mid = len/2;
        for(int i = 0;i<len;i++){
            if(i != mid && nums[i] < nums[mid])return 0;
        }
        return 1;
    }
    
}
