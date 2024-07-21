import java.util.Arrays;

public class PrintRemainingElement {
    public static void main(String[] args) {
        

        long n  = 7;
        long[] arr = {7, 8, 3, 4, 2, 9, 5};


        for(int i =1;i<arr.length;i++){

            for(int j=i;j>=1;j--){

                if(arr[j]<arr[j-1]){
                    long temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }

            }

        }

        int start=0;
        int end=0;
        boolean toggle=true;
        while (start<end) {
            if(toggle){
                //remove maximum
                end--;
                toggle=false;
            }else{
                //remove minimum
                start++;
                toggle=true;
            }
          
        }

        System.out.println(arr[end]);

    }
}
