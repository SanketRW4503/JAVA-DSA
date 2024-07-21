
// finding occurances of number in given array using hashing
//https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0
import java.util.Arrays;

public class FindOccurances {
    public static void main(String[] args) {

        int N = 2;
        int arr[] = { 8, 9 };
        int P = 9;

        int[] hashh = new int[P + N];

        for (int i = 0; i <= N - 1; i++) {
            hashh[arr[i]] += 1;
        }

        for (int i = 0; i <= N - 1; i++) {
            arr[i] = hashh[i + 1];
        }

    }

}
