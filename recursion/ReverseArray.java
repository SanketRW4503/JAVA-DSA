import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        
        int [] arr={1,2,3,5,6,7};

        System.out.println(Arrays.toString(revarray(arr, 0, arr.length-1)));

    }

    public static int[] revarray(int []arr,int start, int end){
 
        //end condition
        if(start>=end){
            return arr;
        }

        //main operation
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]= temp;

        
        //recall 
        return revarray(arr, ++start, --end);


    }
    
} 
