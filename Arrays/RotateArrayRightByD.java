import java.util.Arrays;


//https://leetcode.com/problems/rotate-array/submissions/1292367693/

public class RotateArrayRightByD {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 10;
        int s = nums.length;

        if (k >= s) {
            k = k % s;

        }

        int[] tempArray = new int[k];

        int count = 0;
        for (int i = s - k; i < s; i++) {

            tempArray[count] = nums[i];
            count++;
        }

        ;

        count = nums.length - 1;
        for (int i = s - k - 1; i >= 0; i--) {

            nums[count] = nums[i];

            count--;
        }

        for (int i = 0; i < k; i++) {

            nums[i] = tempArray[i];
        }

        System.out.println(Arrays.toString(nums));

    }
}
