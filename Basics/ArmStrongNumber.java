public class ArmStrongNumber {
    public static void main(String[] args) {

        System.out.println(isArmstrong(13));

    }

    public static boolean isArmstrong(int num) {
        // wrtie your code here;

        int temp = num;
        int sum = 0;
        while (0 < temp) {

            int lastdigit = temp % 10;

            sum = sum + (lastdigit * lastdigit * lastdigit);

            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println("YES");
            return true;
        } else {
            System.out.println("NO");
            return false;
        }
    }
}
