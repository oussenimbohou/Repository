/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein_barack
 */
public class Pb_PointOfEquilibrium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[]{2, 1, 1, 1, 2, 1, 7};
        System.out.println("POE: "+pointOfEquil(nums));
    }
    private static int pointOfEquil(int[] nums){
        int sum1 = 0,sum2;
        for(int i = 0;i<nums.length;i++){
            sum1 += nums[i];
            sum2 = 0;
            for(int j = i+2;j<nums.length;j++){
                sum2 += nums[j];
            }
            if(sum1 == sum2) return i+1;
        }
        return -1;
    }
    
}
