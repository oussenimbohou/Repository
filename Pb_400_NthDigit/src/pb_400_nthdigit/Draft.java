/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_400_nthdigit;

import java.util.ArrayList;

/**
 *
 * @author hussein_barack
 */
public class Draft {
  //  static int i;
    private static int nthDigit(int num){
        ArrayList<Integer> list = new ArrayList<>();
        int a = 10;
        if(num < 10) return num;
        addDigit(list,a);
        while(true){
            if(list.size() + 9 < num)addDigit(list,++a);
            System.out.println("list: "+list);
            for(int i =0;i<list.size();i++){
                if(i+10 == num) return list.get(i);
            }
        }
    }

    private static void addDigit(ArrayList<Integer> list , int a) {
        String temp = String.valueOf(a);
        for(char e: temp.toCharArray())
            list.add(Integer.parseInt(String.valueOf(e)));
    }    
    
}
