/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein_barack
 */
public class Pb_50_POW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Power of n: "+myPow(2,10));
    }
    private static double POW(double num,int n){
        int flag = 0;
        double res =1;
        if(num == 0) return 0;
        if(num != 0 && n == 0) return 1;
        if(n < 0){
            flag = 1;
            n = -n;
        }
        while(n>0){
            res *= num;
            n--;
        }
        if(flag == 1) return 1.0/res;
        else return res;
    }
    private static double myPow(double x,int n){
        if(x == 0) return 0;
        if(x != 0 && n == 0) return 1; 
        if(n == 2) return x*x;
        if(n<0) return 1/x*myPow(1/x,-(n+1));
        if(n%2 == 0) return myPow(myPow(x, (int) ((n/2))),2);
        else return x*myPow(myPow(x, (int) ((n/2))),2);
    }
}
