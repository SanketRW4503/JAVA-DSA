import java.util.Arrays;

public class SwapKthElement {
    public static void main(String[] args) {

        int n = 8;
        int k = 3;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int temp = arr[k - 1];
        arr[k - 1] = arr[n - k];
        arr[n - k] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
