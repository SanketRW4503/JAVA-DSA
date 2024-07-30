import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 3 };

        System.out.println(Arrays.toString(nextGreaterElements(arr)));

    }

 

    public static int[] nextGreaterElements(int[] arr) {
        // brute force approach
        int[] ans = new int[arr.length];

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            boolean got = false;

            for (int j = i + 1; j <= i + (n - 1); j++) {
                int index = j % n;

                if (arr[index] > arr[i]) {
                    ans[i] = arr[index];
                    got = true;
                    break;
                }
            }

            if (got == false) {
                ans[i] = -1;
            }

        }

        return ans;

    }
}
