
//https://www.naukri.com/code360/problems/sorted-array_6613259

import java.util.ArrayList;
import java.util.List;

public class UnionArray {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 2, 3, 4, 5, 5, 6 };
        int[] arr2 = { 2, 2, 4, 10 };
        List<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                if (!union.contains(arr1[i])) {
                    union.add(arr1[i]);
                }
                i++;
            } else {

                if (!union.contains(arr2[j])) {
                    union.add(arr2[j]);
                }
                j++;
            }

        }

        while (i < arr1.length) {
            if (!union.contains(arr1[i])) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (!union.contains(arr2[j])) {
                union.add(arr2[j]);
            }
            j++;
        }

        System.out.println(union);

    }
}
