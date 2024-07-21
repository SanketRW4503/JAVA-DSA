import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        
        int [] arr={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n =arr.length;

        for(int i =0;i<n-1;i++){

            //innner loop
            for(int j=0;j<n-i-1;j++){

                //check maximum number and swap
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp= arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;


                }
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
