

public class SumOfString {
    public static void main(String[] args) {

        String num1 = "2500";

        String num2 = "23";

        int leftlen = num1.length() - 1;
        int rightlen = num2.length() - 1;

        String ans = "";
        int carry = 0;
        while (leftlen != 0 && rightlen != 0) {

            char lastDigit1 = num1.charAt(leftlen);
            char lastDigit2 = num2.charAt(rightlen);

            int a = (leftlen + carry) + rightlen;
            carry = 0;

            if (a > 10) {
                carry++;
            }
            ans = a + ans;
            leftlen--;
            rightlen--;

        }

        while (leftlen != 0) {
            ans = leftlen + ans;

            leftlen--;
        }

        while (rightlen != 0) {
            ans = rightlen + ans;

            rightlen--;
        }

        System.out.println(ans);

    }
}
