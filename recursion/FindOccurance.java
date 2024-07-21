import java.util.Arrays;

public class FindOccurance {
    public static void main(String[] args) {
        
        int [] arr={1,3,5,1,9};

        int [] hashh=new int[arr.length+arr[arr.length-1]];

        for(int i =0;i<=arr.length-1;i++){
            hashh[arr[i]]+=1;
        }


        for(int i :arr){
            System.out.println(i+":-"+hashh[i]);
        }
    }
}
