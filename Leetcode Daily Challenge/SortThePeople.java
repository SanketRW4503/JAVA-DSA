
import java.util.Arrays;

public class SortThePeople{

    public static void main(String[] args) {
   String []names= {"sanket","data","name3"};

        int []height={120,180,300};


        for(int i =0;i<names.length;i++){

            for(int j=height.length-1;j>i;j--){

                    if(height[j]>height[j-1]){
                        int temp=height[j];
                        height[j]=height[j-1];
                        height[j-1]=temp;

                        String tempName= names[j];
                        names[j]=names[j-1];
                        names[j-1]=tempName;
                    }
            }

        }

        System.out.println(Arrays.toString(height));
        System.out.println(Arrays.toString(names));
    }


}