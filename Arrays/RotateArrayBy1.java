
//Left Rotate an Array by One

//https://www.naukri.com/code360/problems/left-rotate-an-array-by-one_5026278?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTabValue=SUBMISSION

import java.util.Arrays;

public class RotateArrayBy1 {
    public static void main(String []args){
        
        int []arr={4 ,0 ,3 ,2 ,5  };
        int n =arr.length;


        int temp =arr[0];
        
        for(int i =1;i<n;i++){

            arr[i-1]=arr[i];
        }

        arr[n-1]=temp;

        System.out.println(Arrays.toString(arr));

    }
}
