
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein_barack
 */
public class draft {
    private static  int[] plusOne(int[] digits) { 
        int len = digits.length;
        int sum = 0;
        for(int i = 0;i<digits.length;i++,len--)sum += digits[i]*Math.pow(10,len-1);
       
        int addOne = sum + 1;
        ArrayList<Integer> list = new ArrayList<>();
        int res;
        while(addOne > 0){
            res = addOne%10;
            list.add(res);
            addOne = addOne/10;
        }
        int[] temp = new int[list.size()];
        for(int i = 0,j = temp.length-1;i<temp.length;i++,j--){
            temp[i] = list.get(j);
        }
        return temp;
    }    
    
}
