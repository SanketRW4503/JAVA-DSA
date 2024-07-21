//https://www.geeksforgeeks.org/problems/sum-of-digit-is-pallindrome-or-not2751/1?page=2&difficulty=School&sortBy=submissions

public class SumOFDigitPalindrome {
    public static void main(String[] args) {

        int n = 98;

        int sum = 0;
        while (n != 0) {

            sum = sum + (n % 10);

            n = n / 10;
        }

        int temp = sum;
        int revOfSum = 0;

        while (temp != 0) {

            revOfSum = (revOfSum * 10) + (temp % 10);

            temp = temp / 10;
        }

        if (revOfSum == sum) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
