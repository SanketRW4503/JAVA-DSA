

//https://leetcode.com/problems/move-zeroes/submissions/1292415233/

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        

        int [] arr={0, 0, 0, 4};
        if(arr.length>1){
            int j=0;
            for(int i =0;i<arr.length;i++){

                if(arr[j]!=0){
                    j++;
                }else{
                    if(arr[i]!=0){
                        arr[j]=arr[i];
                        arr[i]=0;
                        j++;
                    }
                }
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
