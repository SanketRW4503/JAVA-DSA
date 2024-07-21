import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = { 3, 4, 5, 1, 2 ,2};

        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));

        // System.out.println(Arrays.toString(merge(arr, 0, (0+arr.length-1)/2,
        // arr.length-1)));
    }

    public static int[] mergeSort(int[] arr, int low, int high) {
        // end condition

        if (low >= high) {

            return arr;
        }
        // divide the array
        int mid = (low + high) / 2;
        // recalling
        mergeSort(arr, low, mid);

        mergeSort(arr, mid + 1, high);

        // merge and return
        return merge(arr, low, mid, high);

    }

    public static int[] merge(int[] arr, int low, int mid, int high) {

        if (low == mid || mid + 1 == high) {
            return arr;
        }

        int[] temp = new int[arr.length];

        int leftPointer = low;
        int rightPointer = mid + 1;

        int count = 0;
        while (leftPointer <= mid && rightPointer <= high) {

            if (arr[leftPointer] <= arr[rightPointer]) {
                // add left one to temp array
                temp[count] = arr[leftPointer];
                leftPointer++;
            } else {
                // add right one to temp array
                temp[count] = arr[rightPointer];
                rightPointer++;
            }
            count++;
        }

        // check remaining left part
        while (leftPointer <= mid) {
            temp[count] = arr[leftPointer];
            count++;
            leftPointer++;
        }

        // check remaining right part
        while (rightPointer <= mid) {
            temp[count] = arr[rightPointer];
            count++;
            rightPointer++;
        }

        return temp;

    }
}
