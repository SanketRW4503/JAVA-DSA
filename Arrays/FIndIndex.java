
//https://www.geeksforgeeks.org/problems/find-index4752/1?page=1&difficulty=School&sortBy=submissions

import java.util.Arrays;

public class FIndIndex {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 5 };


        System.out.println(Arrays.toString(findIndex(arr, arr.length, 5)));
    }

    public static int[] findIndex(int arr[], int n, int key) {
        // code here.
        int[] indexArray = { -1, -1 };

        int s = 0;
        int e = n - 1;
        while (s <= e) {

            if (arr[s] == key) {
                indexArray[0] = s;
                break;
            }
            s++;
        }

        while (e >= 0) {

            if (arr[e] == key) {
                indexArray[1] = e;
                break;
            }
            e--;
        }

        return indexArray;

    }

}