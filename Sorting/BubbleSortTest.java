import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
        
        int[] arr = { 5, 4, 3, 2, 1};
        int k =arr.length;




            for(int i =0;i<k-1;i++){

                //inner for loop
                for(int j=0;j<k-i-1;j++){

                    if(arr[j+1]<arr[j]){
                        //swap
                        int temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            
    }

        System.out.println(Arrays.toString(arr));

    }
}
