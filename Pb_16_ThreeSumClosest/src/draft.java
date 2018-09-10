
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
public class draft {
    private static int threeSumClosest(int[] nums,int target){
        Arrays.sort(nums);
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                for(int k = j+1;k<nums.length;k++){
                    hmap.put(nums[i] + nums[j] + nums[k] - target, nums[i] + nums[j] + nums[k] );
                }   
            }
        }
        System.out.println("Hash Map: "+hmap);
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(Math.abs(key) < Math.abs(min)) min = key; 
        }
        return hmap.get(min);
    }    
}
