import java.util.HashMap;
import java.util.Map;

public class SortArrayByIncreasingFrequency {

        public static void main(String[] args) {
            
            int []arr={1,1,2,2,2,3};

            Map<Integer,Integer> map= new HashMap<>();
            

            for(int i :arr){
                if(map.containsKey(i)){
                    map.put(i, map.get(i)+1);
                }else{
                    map.put(i, 1);
                }
            }


            for(Integer i:map.keySet()){
                    System.err.println(i+":"+map.get(i));
            }


        }
    
}