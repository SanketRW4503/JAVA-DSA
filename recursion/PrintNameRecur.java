package recursion;

//print name using recursion for N time
public class PrintNameRecur {
    public static void main(String[] args) {
        int n = 20;

        printName(1, n);
    }

    public static void printName(int i, int n) {
        if (i > n) {
            return;
        }

        System.out.println("sanket");

        printName(i + 1, n);
    }
}
