

//https://www.geeksforgeeks.org/problems/smaller-and-larger4005/1?page=2&difficulty=School&sortBy=submissions

import java.util.Arrays;

public class SmallerAndLarger {
    public static void main(String[] args) {

        int n = 7, x = 0;
        int arr[] = { 1, 2, 8, 10, 11, 12, 19 };

        int [] ansArray=new int[2];

        for( int i =0;i<n;i++){
            if(arr[i]<=x){
                ansArray[0]=ansArray[0]+1;
            }

            if(arr[i]>=x){
                ansArray[1]=ansArray[1]+1;
            }
        }


        System.out.println(Arrays.toString(ansArray));

    }
}
