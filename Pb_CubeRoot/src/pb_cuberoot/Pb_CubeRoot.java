/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_cuberoot;

/**
 *
 * @author hussein_barack
 */
public class Pb_CubeRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CBRT: "+CubeRoot(27));
    }
    @SuppressWarnings("empty-statement")
    private static boolean CubeRoot(int num){
        double i,precision = 1e-6;
        for( i = 1;(i*i*i) <= num;i++);
        for(--i;(i*i*i) < num;i+=precision);
        return (int) i == i;
    }    
    
}
