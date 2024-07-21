import java.util.HashMap;

public class FindOccurancesHashmap {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        int [] arr={1,2,1,3,4,5,5,3};

        @SuppressWarnings("rawtypes")
        HashMap hashh=new HashMap<Integer,Integer>();

        for(int i =0;i<=arr.length-1;i++){
            if(hashh.containsKey(arr[i])){
                int temp= (int) hashh.get(arr[i]);
                hashh.put(arr[i],temp+1 );
            }else{
                hashh.put(arr[i], 1);
            }
        }
        System.out.println(hashh);
    }
}
