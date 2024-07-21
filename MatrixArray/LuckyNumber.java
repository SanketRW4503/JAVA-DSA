import java.util.ArrayList;

/**
 * LuckyNumber
 */
public class LuckyNumber {

    public static void main(String[] args) {
        
        int [][]arr= {{1,10,4,2},{9,3,8,7},{15,16,17,12}};

        int m = arr.length;

        ArrayList<Integer> list= new ArrayList<>();
        for(int i =0;i<m;i++){

            int j = getMin(arr[i]);
            boolean maxPresent=false;

            for(int c=0;c<m;c++){
                    if(arr[c][j]>arr[i][j] && arr[c][j]!=arr[i][j]){
                        maxPresent=true;
                        break;
                    }
            }

            if(maxPresent==false){
                list.add(arr[i][j]);
            }
        }

        System.out.println(list);

    }


    public static int getMin(int[] arr){

        int index=-1;
        int min= Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(min>arr[i]){
                min=arr[i];
                index=i;
            }
        }

        return index;

    }
}