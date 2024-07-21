public class CountZero {
    public static void main(String[] args) {

        int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                count++;

            } else {
                break;
            }
        }

        System.out.println(count);

    }
}
