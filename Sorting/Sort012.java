import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        
        int [] arr={0,1,2,1,2,0,2,0};

        int low=0;
        int mid =0;
        int high=arr.length-1;

        while (mid<=high) {
            
            if(arr[mid]==0){
                swap(arr, mid,low);
                low++;
                mid++;
            }else if (arr[mid]==1){
                mid ++;
            }else{
                swap(arr, mid, high);
                high--;
            }

        }

        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int []arr, int first, int second){

        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]= temp;

    }
}
