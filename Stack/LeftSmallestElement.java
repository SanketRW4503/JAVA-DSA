import java.util.Arrays;
import java.util.Stack;

public class LeftSmallestElement {
    public static void main(String[] args) {

        int[] arr = { 4, 5, 2, 7, 8 };

        System.out.println(Arrays.toString(getSmallest(arr)));

    }

    public static int[] getSmallest(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (stack.empty()) {
                ans[i] = -1;
            } else {

                if (stack.peek() < arr[i]) {
                    ans[i] = stack.peek();
                } else {
                    while (stack.empty() != true) {

                        if (stack.peek() < arr[i]) {
                            ans[i] = stack.peek();
                            break;
                        }
                        stack.pop();
                    }

                    if (stack.empty()) {
                        ans[i] = -1;
                    }
                }

            }

            stack.push(arr[i]);

        }

        return ans;

    }

}
