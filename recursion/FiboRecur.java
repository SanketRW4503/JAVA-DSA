public class FiboRecur {

    public static void main(String[] args) {

        int n = 1;

        System.out.println(findFibo(n));
    }

    public static int findFibo(int n) {

        // end condition
        if (n <= 1) {
            return n;
        }

        // recall
        return findFibo(n - 1) + findFibo(n - 2);

    }
}
