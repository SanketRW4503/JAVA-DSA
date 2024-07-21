

//https://www.naukri.com/code360/problems/rotate-array_1230543?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArrayByd {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(7, 5 ,2 ,11, 2 ,43 ,1 ,1));

        int k = 8+2;

        int s = list.size();

        if (k >= list.size()) {
            k = k % s;
        }

      
        int count =0;
        for(int i=k;i<s;i++){
            int temp = list.get(i);
            list.remove(i);
            list.add(count, temp);
            count++;
        }

        System.out.println(list);

    }
}
