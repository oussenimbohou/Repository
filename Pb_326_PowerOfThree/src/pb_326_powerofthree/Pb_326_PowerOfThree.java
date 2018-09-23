/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_326_powerofthree;

/**
 *
 * @author hussein_barack
 */
public class Pb_326_PowerOfThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Is Power of Three: "+isPowerOfThree(243));
    }
    private static boolean isPowerOfThree(int n){
        return n == Math.pow(3, Math.round(Math.log(n)/Math.log(3)));
    }
    
}
