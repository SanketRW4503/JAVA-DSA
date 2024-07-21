import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fibo {
    
    public static void main(String[] args) {
        
        int n =10;
        int firstNumber=0;
        int secondNumber=1;
       

        int []arr=new int[n];
        
        arr[0]=firstNumber;
        arr[1]=secondNumber;
        for(int i =2;i<n;i++){

            arr[i]=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=arr[i];
        
        }

        System.out.println(Arrays.toString(arr));
        
    }
}
