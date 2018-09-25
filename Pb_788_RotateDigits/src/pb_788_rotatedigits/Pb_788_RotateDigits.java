/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_788_rotatedigits;

/**
 *
 * @author hussein_barack
 */
public class Pb_788_RotateDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Rotate Digits: "+rotateDigts(90));
    }
   private static int rotateDigts(int num){
       int count = 0;
       String invariables  = "[018]+";
       String variables    = "[2569]+";
       String validNumbers = "[0125689]+";
       while(num > 0){
           String string = num+"";
           if(string.matches(invariables)){
           }else if(string.matches(validNumbers)){
               count++;
           }
           num--;
       }
       return count;
   }     
    
}
