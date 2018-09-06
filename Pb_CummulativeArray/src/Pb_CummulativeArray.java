/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein_barack
 */
public class Pb_CummulativeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[]{3,3,6,12,24,};
        System.out.println("Cummulative Array: "+isCummulative(nums));
    }
    private static int isCummulative(int[] a){
        int sum;
        for(int i = 1;i<a.length;i++){
            sum = 0;
            for(int j = 0;j<i;j++){
                sum += a[j]; 
            }
            if(sum != a[i]) return 0;
        }
        return 1;
    }
}
