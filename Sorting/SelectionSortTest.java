import java.util.Arrays;

public class SelectionSortTest {
    public static void main(String[] args) {
        
int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int k=arr.length;

        for(int i =0;i<k-1;i++){

            int count =i;
            for(int j =i;j<=k-1;j++){

              if(arr[j]<arr[count]){
                count=j;
              }
            }

            //swaping 
            if(count!=i){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
