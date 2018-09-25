/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_344_reversestring;

/**
 *
 * @author hussein_barack
 */
public class Pb_344_ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string = "     Ousseni     Mbohou     Mfouapon   ";
        System.out.println("Reverse String:"+reverseString(string));
        System.out.println("Reverse: "+reverse("A man, a plan, a canal: Panama"));
    }
    private static String reverse(String mystring){
        StringBuilder sb = new StringBuilder(mystring);
        return sb.reverse().toString();       
    }
  private static String reverseString(String mystring){
       System.out.println("original string: "+mystring);
       String[] ar = mystring.trim().split(" ");
       String str = "";
       for(String e:ar)
           if(e.length() != 0 ) str += e + " "; 
       String string = " ";
       String[] array = str.split(" ");
       for(int i = array.length/2;i<array.length;i++){
           String temp = array[array.length-1-i];
           array[array.length-1-i] = array[i];
           array[i] = temp;
           string +=array[i]+" ";
       }
       for(int i = array.length/2;i<array.length;i++){
           string +=array[i]+" ";
       }
       return string;
   }     
    
}
