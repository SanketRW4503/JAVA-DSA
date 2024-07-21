
import java.util.ArrayList;

//https://www.geeksforgeeks.org/problems/value-equal-to-index-value1330/1?page=1&difficulty=School&sortBy=submissions

public class ValueIndexEqual {
    public static void main(String[] args) {

        int arr[] = { 15, 2, 45, 12, 7, 6};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == i + 1) {
                list.add(i + 1);
            }
        }

        System.out.println(list);

    }
}
