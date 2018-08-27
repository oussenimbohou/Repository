
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein_barack
 */
public class Pb_46_Permutations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[]{1,2,3,4};
        System.out.println("Permute: "+permutation(nums));
    }
    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> bigList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int k = 1,j= 0;
        int[] x = new int[nums.length];
        System.arraycopy(nums, 0, x, 0, x.length);
        int listSize = factorial(nums.length);
        while(listSize>0){
            if(!list.isEmpty()) list.clear(); 
            int temp = nums[nums.length -1];
            for(int i = nums.length-1;i>0;i--){
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
//            for(int e:nums)list.add(e);
//            System.out.println("List: "+list);
            if((listSize-1) % nums.length == 0){
                if(k+1>=nums.length) k = 1;
//                System.out.println("k value: "+k);
                swap(nums,j,k);
                    k++;      
            }   
            for(int e:nums)list.add(e);
            listSize--;
//            if(list.toString().equals(Arrays.toString(x))){
//                System.out.println("Original array: "+Arrays.toString(x));
//                swap(nums,1,2);
//            }       
            System.out.println("List: "+list);
            bigList.add(new ArrayList<>(list));               
        }
        System.out.println("List Size: "+bigList.size());

        return bigList;
    }

    private static int factorial(int n){
       if(n == 0) return 1;
       if(n == 1) return 1;
       else return n*factorial(n-1);        
    }

    private static void swap(int[] nums, int i, int i0) {
//        System.out.println("Num: "+Arrays.toString(nums)+" k: "+i0);
        int temp = nums[i];
         nums[i] = nums[i0];
        nums[i0] = temp;
    }
    
    private static List<List<Integer>> permutation(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums==null || nums.length==0) return list;
        Arrays.sort(nums);
        
        list.add(convert(nums));
        while(next(nums)){
            list.add(convert(nums));            
        }
        return list;
    }
    private static List<Integer> convert(int[] nums){
        List<Integer> list = new ArrayList<>();
        for(int num:nums) list.add(num);
        return list;
    }
    private static boolean next(int[] nums){
        for(int i = nums.length-2;i>=0;i--){
            int a = nums[i];
            int b = nums[i+1];
            if(a<b){
                //swap i with next big
                int idx = 0;
                for(int j = nums.length-1;j>=i+1;j--){
                    if(nums[j]>a){
                        idx = j;
                        break;
                    }
                }
                int tmp = nums[i];
                nums[i]=nums[idx];
                nums[idx] = tmp;
                
                //sort i+1~end;
                Arrays.sort(nums, i+1, nums.length);
                return true;
            }
        }
        return false;
    }

    
}
