
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr={1,10,2,3};

        HashMap<Integer,Integer> hashMap= new HashMap<>();
        
        int [] ansArray=new int[2] ;


        int target =5;

        for(int i =0;i<arr.length;i++){

            int require= target-arr[i];

            if(hashMap.containsKey(require)){

                ansArray[0]=require;
                ansArray[1]=arr[i];
                break;
            }


            hashMap.put(arr[i], i);

        }

        System.out.println(Arrays.toString(ansArray));
        

    }

}
