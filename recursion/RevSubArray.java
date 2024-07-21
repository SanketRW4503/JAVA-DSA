
//prending
//https://www.geeksforgeeks.org/problems/reverse-sub-array5620/1

import java.util.Arrays;

public class RevSubArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};

        arr=reverseSubArray(arr, 7, 2, 4);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] reverseSubArray(int arr[], int n, int l, int r) {
        // code here

        //first we need find the l and r pos

        int start = findpos(arr,l,0);
        int end = findpos(arr,r,0);

        return rev(arr,start,end);

    }

    public static int[] rev(int []arr, int start, int end) {
            //end condition
            if(start>=end){
                return arr;
            }

            //main operation
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;

            //recall 
            return rev(arr, ++start, --end);
    }

    public static int findpos(int []arr, int n , int i){
        

         //end condition 2
        if(n==i){
            return 0;
        }
        //end condition
        if(arr[i]==n){
            return i;
        }
        
       

        //recall
        return findpos(arr, n, i+1);
    }

    
}
