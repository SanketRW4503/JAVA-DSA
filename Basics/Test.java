
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int []arr={2,2,0,1};

        int low=0;
        int mid=0;
        int high = arr.length-1;

        while (mid<=high) {
                if(arr[mid]==0){
                    int temp =arr[mid];
                    arr[mid]=arr[low];
                    arr[low]=temp;
                    low++;
                }else if (arr[mid]==1){
                    mid++;
                }else{

                    int temp =arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                }
        }

        System.out.println(Arrays.toString(arr));

    }


}