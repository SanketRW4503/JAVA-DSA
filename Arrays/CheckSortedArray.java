/**
 * check if the array is sorted or not 
 */

 //https://www.naukri.com/code360/problems/ninja-and-the-sorted-check_6581957
 
public class CheckSortedArray {

    public static void main(String[] args) {
        
        int []arr={ 1,1,2,3,9,5,100};
        
        System.out.println(isSorted(arr.length-1, arr));

    }

     public static int isSorted(int n, int []arr ){
        // Write your code here.


        for(int i =0;i<n-1;i++){
            
            if(arr[i]>arr[i+1] && arr[i]!=arr[i+1]){
                return 0;
            }

        }

        return 1;


    }
    
}