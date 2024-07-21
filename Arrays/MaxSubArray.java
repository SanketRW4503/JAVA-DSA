import java.util.HashMap;

public class MaxSubArray {
    public static void main(String[] args) {

        int[] arr = {9, 4, 20, 3, 10, 5 };

        
        int k =33;

        int len=0;

        HashMap<Integer,Integer> map= new HashMap<>();


        for(int i =0;i<arr.length;i++){

            if(arr[i]==k && len==0 ){
                len=1;
            }

            if(arr[i]<k){
                int require= k-arr[i];

                    if(map.containsKey(require)){
                        int temp =(i-map.get(require))+1;
                        if(len<temp){
                            len= temp;
                        }
                    }

            }

            map.put(arr[i], i);

        }

        System.out.println(len);

    }
}
