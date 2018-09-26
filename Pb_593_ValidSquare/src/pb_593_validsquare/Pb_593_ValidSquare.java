/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_593_validsquare;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hussein_barack
 */
public class Pb_593_ValidSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] p1 = new int[]{2,1};
        int[] p2 = new int[]{4,1};
        int[] p3 = new int[]{4,3};
        int[] p4 = new int[]{2,3};        

        System.out.println("Valid Square: "+validSquare(p1, p2, p3, p4));
    }
    private static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4){
        Set set = new HashSet<>();
        set.add(helper(p1,p2));
        set.add(helper(p1,p3));
        set.add(helper(p1,p4));
        set.add(helper(p2,p3));
        set.add(helper(p2,p4));
        set.add(helper(p3,p4));
        
        return !set.contains(0) && set.size() == 2;
        
    }
    
    private static int helper(int[] a, int[] b){
        return (a[0]-b[0])*(a[0]-b[0]) +(a[1]-b[1])*(a[1]-b[1]);
    }
    
}
