/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programming;

import java.util.Arrays;

/**
 *
 * @author LADY
 */
public class Programming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[] = new int[]{1,2,3,4,5,6,7,8,9,10,10}; 
        int a[] = new int[]{1,2,2,1,3,0}; 
        int[] b = new int[]{3,3,6,12,24,48};
        int[] c = new int[]{1,4,1,4,5,6};
        System.out.println("Even Odd: "+Arrays.toString(evenOddArray(nums)));
        System.out.println("Dual Array: "+isDual(a));
        System.out.println("Single Max: "+hasSingleMax(nums));
        System.out.println("Closest Fibonnaci: "+closestFibonnaci(30));
        System.out.println("Closest Fibonnaci Num: "+closestFibonnaciNumber(50));
        System.out.println("Cummulative Array: "+isCummuative(b));
        System.out.println("Paired Array: "+isPairedN(c, 5));
        System.out.println("Paired Array bool: "+isPairedArray(c, 5));
        System.out.println("K Small Factors: "+hasKSmallFactors(8, 42));
    }
    private static int[] evenOddArray(int[] nums){
        for(int i = 0,j=-1;i<nums.length;i++){
            if(nums[i]%2 == 0){
                j++;
                swap(nums,i,j);
            }
        }
        return nums;
    }
    private static void swap(int[] nums, int i, int j) {
        if(nums[i] == nums[j])return;
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j]; 
    }
    private static int isDual(int[] nums){
        if(nums.length == 1 && nums.length < 2) return 0;
        int sum = nums[0]+nums[1];
        for(int i = 2;i<nums.length-1;i = i+2){
            if(sum == nums[i]+nums[i+1])
                sum = nums[i]+nums[i+1];
            else return 0;
        }
        return 1;
    }
    private static int hasSingleMax(int[] nums){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int e:nums){
            if(e>=first){
                second = first;
                first = e;
            }
        }
        if(first == second)return 0;
        return 1;
    }
    private static int closestFibonnaci(int num){
        int a,b = 1,c = 2;
        while(true){
            a = b;
            b = c;
            c = a+b;
            if(a<= num && b>num)return a;
        }
    }
    private static int closestFibonnaciNumber(int num){
        int a,b = 1,c = 2;
        while(true){
            a = b;
            b = c;
            c = a+b;
            if(a<= num && b>num){
                if(Math.abs(a-num) <= Math.abs(b-num)) return a;
                else if(Math.abs(a-num) >= Math.abs(b-num)) return b;
            }
        }
    }    
    private static int isCummuative(int[] nums){
        for(int i = 1;i<nums.length;i++){
            int sum = 0;
            for(int j = 0;j<i;j++)
                sum +=nums[j];
            if(nums[i] != sum) return 0;
        }
        return 1;
    }
    private static int isPairedN(int[] nums,int n){
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == n && i+j == n)return 1;
            }
        }
        return 0;
    }
    private static boolean isPairedArray(int[] nums,int n){
        int len = nums.length;
        int left = 0;
        int right = len-1;
        Arrays.sort(nums);
        while(left < right){
            if(nums[left] + nums[right] == n)
                return true;
            else if(nums[left]+nums[right] < n)
                left++;
            else right--;
        }
        return false;
    }
    private static boolean hasKSnmallFactors(int k,int num){
        int a = 1,b = num;
        while(b > Math.sqrt(num)){
            if(num%a == 0){
                b = num/a;
                if(a<k && b<k) return true;
            }
            a++;
        }
        return false;
    } 
    private static boolean hasKSmallFactors(int k,int n){
        for(int a = 2,b;a<Math.sqrt(n);a++){
            if(n%a == 0){
                b = n/a;
                System.out.println("a: "+a+" b: "+b);
                if(a<k && b <k) return true;
            }
        }
        
        return false;
    }    
    
}
