
//https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1

import java.util.Arrays;

public class RotateArrayGFG {

    public static void main(String[] args) {
        int[] arr = { 2,4,6,8,10,12,14,16,18,20 };

        int n = arr.length;
        int d = 3;

        if (d >= n) {
            d = d % n;
        }

        // create temp array
        int[] tempArray = new int[d];

        // add first d elements to the temporarry array
        for (int i = 0; i < d; i++) {
            tempArray[i] = arr[i];

        }

        // left shift the elements to start
        int count = 0;
        for (int i = d; i < n; i++) {

            arr[count] = arr[i];
            count++;
        }

        
      
        //add temporarry array data back to the original array
        for(int i=0;i<tempArray.length;i++){
            arr[count]=tempArray[i];
            count++;
        }


        //rotation done
        System.out.println(Arrays.toString(arr));
    }
}
