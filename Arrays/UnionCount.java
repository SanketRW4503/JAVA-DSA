
//https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1

import java.util.ArrayList;
import java.util.HashSet;

public class UnionCount {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 2, 3, 4, 5, 5, 6 };
        int[] arr2 = { 2, 2, 4, 10 };

       
        HashSet<Integer> unionSet = new HashSet<>();

        // Add elements from arr1
        for (int num : arr1) {
            unionSet.add(num);
        }

        // Add elements from arr2
        for (int num : arr2) {
            unionSet.add(num);
        }

        // Size of the HashSet gives the count of unique elements in the union
        int count = unionSet.size();
        System.out.println(count);
    }
}
