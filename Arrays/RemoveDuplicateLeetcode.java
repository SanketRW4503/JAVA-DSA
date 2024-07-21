import java.util.Arrays;

public class RemoveDuplicateLeetcode {
    public static void main(String[] args) {

        int []arr={0,0,0,0,3};


        int nextNumber= arr[0]+1;
        int j =1;
        int i ;
        int lastNumber=arr[0];
        for(i =1;i<arr.length;i++){

            if(arr[i]!=nextNumber){

                    while (j<arr.length) {

                        if(arr[j]==nextNumber){

                            arr[i]=arr[j];
                            break;
                        }

                        if(arr[j]==lastNumber){
                            arr[j]=-101;
                        }


                        j++;
                    }

                    if(j==arr.length){
                      j=i;
                    }
                    arr[j]=-101;

               

            }

                nextNumber=arr[i]+1;
                lastNumber=arr[i];
                j++;


        }


        System.out.println(Arrays.toString(arr));
        System.out.println(i);

    }
}
