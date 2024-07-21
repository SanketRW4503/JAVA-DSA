
//pending
public class SumOFConcecativeGFG {
    public static void main(String[] args) {

        int n = 15;

        int count = 0;
        for (int i = 1; i < n; i++) {
            int sum = 0;
            int j = i;
            while (sum < n) {
                sum = sum + j;

                if (sum == n) {

                    count++;
                    break;
                }
                j++;
            }
            sum = 0;
        }

        System.out.println(count);
    }
}
