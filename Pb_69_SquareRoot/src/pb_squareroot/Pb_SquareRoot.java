/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_squareroot;

/**
 *
 * @author hussein_barack
 */
public class Pb_SquareRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Square Root: "+squareRoot(8));
    }
    private static int squareRoot(int num){
        if(num == 0) return 0;
        double last = 0;
        double res = 1;
        while(res != last){
            last = res;
            res = (res+num/res)/2;
        }
        return (int)res;
    }
    
}
