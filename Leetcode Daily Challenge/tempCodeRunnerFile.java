import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        
        int []arr={5,4,3,2,1};

        mergeSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    public static void mergeSort(int []arr,int low,int high){

            if(low>=high){
                return;
            }

            int mid = low+(high-low)/2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);


            merge(arr,low,mid,high);

    }   

    public static void merge(int []arr,int low,int high,int mid){
        if(low>=high){
            return;
        }

        int left=low;
        int right=mid+1;

        int [] tempArray= new int[arr.length];

        int count =0;

        while (left<=mid && right<=high) {
            if(arr[left]<=arr[right]){
                    tempArray[count]=arr[left];
                    left++;
            }else{
                tempArray[count]=arr[right];
                right++;
            }
            count++;
                
        }

        //remaining of left

        while(left<=mid){
            tempArray[count]=arr[left];
            left++;
            count++;
        }
        
        //if right is remaining
        while (right<=high) {
            tempArray[count]=arr[right];
            right++;
            count++;
        }
        // Copy the sorted subarray from tempArray to arr[]
             for (int i = low; i <= high; i++) {
                     arr[i] = tempArray[i];
            }


    }

}