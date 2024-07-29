import java.util.HashSet;
import java.util.Set;

public class SumOfUniqueELement {
    public static void main(String[] args) {
        int []arr={1,1,1,1,1};

        System.out.println(sumOfUnique(arr));
    }
       public static int sumOfUnique(int[] arr) {
        

        Set<Integer> set= new HashSet<>();
        
        Set<Integer> removedList= new HashSet<>();

        int ans=0;

        for(int i =0;i<arr.length;i++){

            if(set.contains(arr[i])){

                set.remove(arr[i]);
                removedList.add(arr[i]);
            }else{  
                if(!removedList.contains(arr[i])){
                     set.add(arr[i]);
                }

            }
        
        }

        for (Integer s : set) {
                ans=ans+s;
        }   

        return ans;
    }
}
