/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein_barack
 */
public class Pb_ClosestFibonnaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Closest Fibonnaci: "+closestFibonnaci(13));
    }
    private static int closestFibonnaci(int num){
        int a,b = 1,c = 2;
        while(true){
            a = b;
            b = c;
            c = a+b;
            if(a<=num && b > num) return a;
        }
    }
    
}
