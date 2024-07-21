import java.util.Arrays;

public class SelectionSortGFG {
    public static void main(String[] args) {
        
        int [] arr={4, 1, 3, 9, 7};
        int n=arr.length;

        for(int i=0;i<n-1;i++){

           int minNumberIndex=select(arr, i);
            if(minNumberIndex!=i){
                //swap
                int temp= arr[i];
                arr[i]=arr[minNumberIndex];
                arr[minNumberIndex]=temp;
            }

        }

        System.out.println(Arrays.toString(arr));

    }

    public static int select(int []arr,int i  ){
        
        int min =i;
        for(int j=i;j<=arr.length-1;j++){
            if(arr[min]>arr[j]){
                min=j;
            }
        }
        
        return min;
        

    }
}
