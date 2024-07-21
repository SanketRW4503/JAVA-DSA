import java.util.HashSet;
import java.util.Set;
//https://www.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1
public class LongestSucessiveElements {
    public static void main(String[] args) {
        
        int []arr = {5,5, 8, 3, 2, 1, 4};
    
        int n   = arr.length;

        int longest=1;
        int count=1;

        HashSet<Integer> set= new HashSet<>();
        
        for(int i : arr){
            set.add(i);
        }

        for(Integer s:set){
            
            if(!set.contains(s-1)){
                int number =s+1;
                while (set.contains(number)) {
                    count++;
                    number++;
                }
                longest=Math.max(longest,count);
                count=1;
            }

        }


        System.out.println(longest);
    }
}
