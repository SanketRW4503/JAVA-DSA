import java.util.Arrays;

public class RotateArrayByD {
    
    public static void main(String[] args) {
        
        int [] arr= {7 ,5 ,2, 11 ,2 ,43 ,1 };
        int d=3;
        int n =arr.length;

        if(d>arr.length){
            d=d%n;
        }

        //create tempororray array
        int [] tempArray= new int[d];

        //add first d elements in this temporarry array
        for(int i =0;i<tempArray.length;i++){
            tempArray[i]=arr[i];
        }


        // shift the remaining elements from starting itslelf in the original array

        int count =0;
        for(int i=d;i<arr.length;i++){
            arr[count]=arr[i];
            count++;
        }

        
        //now add the temporarry array values to the original array

        for(int i =0;i<tempArray.length;i++){
            arr[count]=tempArray[i];
            count++;
        }


        System.out.println(Arrays.toString(arr));
    }
}
