import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
//https://www.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1
public class InterSectionOfTwoArrayGFG {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 3, 4, 5, 6, 7 };


        Set<Integer> set= new HashSet<>();
        
        for(int i :arr1){
            set.add(i);
        }

        int count =0;
        for(int i =0;i<arr2.length;i++){

            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }


        System.out.println(count);
       
    }
}
