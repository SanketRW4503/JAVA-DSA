
//https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?page=1&difficulty=School&sortBy=submissions

public class PrintOneToN {
    public static void main(String[] args) {

            printNos(10);

    }

    public static  void printNos(int N) {
        // Your code here
        // end condition
        if (0 >= N) {
            return;
        }

        printNos(N - 1);
        System.out.print(N);
    }
}
