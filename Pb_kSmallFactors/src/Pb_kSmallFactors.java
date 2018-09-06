/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein_barack
 */
public class Pb_kSmallFactors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Has K Small Factors: "+hasKSmallFactors(7, 30));
    }
    private static boolean hasKSmallFactors(int k,int n){
        int a = 1,b = n;
        while(b > Math.sqrt(n)){
            if(n%a == 0){
                b = n/a;
                System.out.println("a: "+a+" b: "+b);
                if(a<k && b <k) return true;
            }
            a++;
        }
        return false;
    }
    
}
