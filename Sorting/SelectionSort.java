import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String[] args) {
        
        int [] arr={5,4,3,2,1,7,89};

        for(int i =0;i<arr.length-1;i++){
            //store minimum value index initially
            int min = i;

            //finding minimum value from array
            for(int j=i;j<=arr.length-1;j++){
                //check minimum
                if(arr[min]>arr[j]){
                    min=j;
                }
            }

            //swap if min value is changed
            if(min!=i){
                int temp =arr[i];    
                arr[i]=arr[min];
                arr[min]=temp;
            }

        }

        System.out.println(Arrays.toString(arr));   

    }

}
