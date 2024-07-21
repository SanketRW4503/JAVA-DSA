import java.util.Arrays;

public class AtLeastTwoGreater {
    
    public static void main(String[] args) {

        long [] arr={7, -2, 3, 4, 9, -1};


        for(int i =0;i<arr.length-1;i++){

            int min=i;
            for(int j=i+1;j<arr.length;j++){

                if(arr[min]>arr[j]){
                    min=j;
                }

            }


            ///perform swapping
            long temp= arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }

        long[] ansArray= new long[arr.length-2];

        for(int i =0;i<arr.length-2;i++){
            
            ansArray[i]=arr[i];
        }

        System.out.println(Arrays.toString(ansArray));
        



    }
}
