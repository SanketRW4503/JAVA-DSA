import java.util.ArrayList;
import java.util.Arrays;

public class Sort012ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(0, 2, 1, 2, 2, 0, 1));

        int low = 0;
        int mid = 0;
        int high = list.size() - 1;

        while (mid <= high) {

            if (list.get(mid) == 0) {
                int temp = list.get(mid);
                list.set(mid, list.get(low));
                list.set(low, temp);
                low++;
                mid++;

            } else if (list.get(mid) == 1) {
                mid++;
            } else {
                int temp = list.get(mid);
                list.set(mid, list.get(high));
                list.set(high, temp);

                high--;

            }

        }

        System.out.println(list);
    }
}
