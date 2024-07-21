

//https://www.naukri.com/code360/problems/ninja-and-the-second-order-elements_6581960?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondSmallestAndLargest {
    public static void main(String[] args) {
        
        int arr[]= {4 ,5,100,3 };
        int n =arr.length;
        int [] ans=new int[2];

        //sort the array
        bubbleSort(arr,n);

        

        ans[0]=arr[1];
        ans[1]=arr[n-2];

        System.out.println(Arrays.toString(ans));

    }


    public static void  bubbleSort(int [] arr,int n){

        for(int i=0; i<=n-2;i++){
            int temp=0;
            for(int j=temp+1;j<=n-1-i;j++){

                if(arr[temp]>arr[j]){
                    //swap
                    int bucket= arr[temp];
                    arr[temp]=arr[j];
                    arr[j]=bucket;
                }

                temp++;
            }

        }



    }

}
