//https://www.geeksforgeeks.org/problems/merge-sort/1

import java.util.Arrays;

public class MergeSortGFG {
    public static void main(String[] args) {

        int []arr={12, 1, 2, 3, 0, 11, 4};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void merge(int arr[], int l, int m, int r)
    {
         // Your code here
        if (l >= r) {
             return;
        }
         
         //create one temporarry array 
         int [] temp= new int [r - l + 1];
         int left=l;
         int right=m+1;
         int count=0;
         
         
         //merging into tempoorarry array
         while(left<=m && right<=r){
             
             if(arr[left]<=arr[right]){
                 temp[count]=arr[left];
                 left++;
             }else{
                 temp[count]=arr[right];
                 right++;
             }
             count++;
         }
         
         //add the remaing elements from left
         while(left<=m){
             temp[count]=arr[left];
             left++;
             count++;
             
         }
         //add the remaining elements from right
          while(right<=r){
             temp[count]=arr[right];
             right++;
             count++;
         }
         
         //add the temporarry array data to the original array
        
         for(int i :temp){
            
            arr[l]=i;
            l++;
         }
         
   
         
    }
    public static void mergeSort(int arr[], int l, int r)
    {
        //code here
        //end condition
        if(l>=r){
            return ;
        }
        
        //get mid
        int mid = (l+r)/2;
        
        //divide the arrays
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        
        
        //merge the two arrays
        merge(arr,l,mid,r);
        
    }
}
