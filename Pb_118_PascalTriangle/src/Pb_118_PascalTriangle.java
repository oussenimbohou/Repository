
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hussein_barack
 */
public class Pb_118_PascalTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Generate: "+generate(5));
    }
    private static List<List<Integer>> generate(int numRows){
        List<List<Integer>> bigList = new ArrayList<>(Arrays.asList(Arrays.asList(1)));
        List<Integer> list = new ArrayList<>(Arrays.asList(1));
        int num;
        if(numRows == 0) return new ArrayList<>();
        if(numRows == 1) return bigList;
        bigList.add(new ArrayList<>(Arrays.asList(1,1)));
        if(numRows == 2) return bigList; 
        for(int i = 2;i<numRows;i++){
            if(!list.isEmpty()) list.clear();
            for(int j = 1;j<i;j++){
                num = bigList.get(bigList.size()-1).get(j-1) +
                          bigList.get(bigList.size()-1).get(j);
                list.add(num);
            }
            list.add(0, 1);
            list.add(list.size(), 1);
            bigList.add(new ArrayList<>(list));
        }
        return bigList;
    }
}
