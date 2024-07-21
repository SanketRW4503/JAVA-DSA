
//https://www.geeksforgeeks.org/problems/perfect-arrays4645/1?page=2&difficulty=School&sortBy=submissions

public class PerfectArray {
    public static void main(String[] args) {

        int n = 5;
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(checkPerfect(arr));

    }

    public static String checkPerfect(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            if (arr[start] == arr[end]) {
                start++;
                end--;
            } else {
                return "NOT PERFECT";
            }

        }

        return "PERFECT";
    }
}
