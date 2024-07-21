import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/insertion-sort/1
public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            arr = insert(arr, i);

        }

        System.out.println(Arrays.toString(arr));

    }

    public static int[] insert(int arr[], int i) {
        // Your code here

        for (int j = i + 1; 0 < j; j--) {

            if (arr[j] < arr[i]) {
                // swaping
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            } else {
                return arr;
            }
            i--;
        }

        return arr;
    }
}
