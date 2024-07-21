import java.util.Arrays;

public class QuickSortGFG {
    public static void main(String[] args) {

        int[] arr = { 95, 13, 47 ,52 ,41 ,68 ,42 };
        int N = 7;

        quickSort(arr, 0, N - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void quickSort(int arr[], int l, int h) {
        // code here
        // end condition
        if (l >= h) {
            return;
        }

        int pIndex= partition(arr, l, h);

        quickSort(arr, l, pIndex);
        quickSort(arr, pIndex+2, h);

    }

    static int partition(int arr[], int l, int h) {
        // your code here

        int s = l;
        int e = h;
        // taking middle element as the pivot
        int pivot = arr[s + (e - s) / 2];

        // lets put the pivot at its correct position

        while (s <= e) {

            while (arr[s] < pivot && s <= h) {
                s++;
            }

            while (arr[e] > pivot && e>=l) {
                e--;
            }

            if (s <= e) {
                // swapping because above both condition violates the rules
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;

                s++;
                e--;
            }

        }

        return e;

    }
}
