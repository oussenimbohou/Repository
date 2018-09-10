/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_8_myatoi;

/**
 *
 * @author hussein_barack
 */
public class Pb_8_MyAtoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ATOI: "+myAtoi("-20000000000000000000 hh"));
        Long a = new Long(0);
        
    }
    //Problem 8
    private static int myAtoi(String str) {
       str = str.trim();
       String regex = "[0-9+-]";
       if(str.length() == 0) return 0;
       String firstChar = str.charAt(0)+"";
       String temp = "";
       if(firstChar.matches(regex)){
           for(int i=0;i<str.length();i++){
              if(String.valueOf(str.charAt(i)).matches("[+-.]") && i != 0)break;
              if(String.valueOf(str.charAt(i)).matches(regex))
                temp += str.charAt(i);
              else break;
           }
       }else return 0;
       try {          
            Double num = Double.parseDouble(temp);
            if(num.compareTo(Double.valueOf(Integer.MAX_VALUE))> 0)return Integer.MAX_VALUE;
            if(num.compareTo(Double.valueOf(Integer.MIN_VALUE))< 0)return Integer.MIN_VALUE; 
            return Integer.parseInt(temp);
        } catch (NumberFormatException e) {
            return 0;
        } 
    }
    
}
