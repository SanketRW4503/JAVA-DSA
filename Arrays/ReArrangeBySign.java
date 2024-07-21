import java.util.Arrays;

public class ReArrangeBySign {
    public static void main(String[] args) {

        int []arr={3,1,-2,-5,2,-4};

        int []ansArray= new int[arr.length];

        int posCount=0;
        int negCount=1;

        for(int i =0;i<arr.length;i++){

            if(arr[i]>=0){
                //positive
                ansArray[posCount]=arr[i];
                posCount=posCount+2;
            }else{
                //negative
                ansArray[negCount]=arr[i];
                negCount=negCount+2;
            }


        }


        System.out.println(Arrays.toString(ansArray));



    }
}
