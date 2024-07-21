import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] arr = { 1,2 };

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if(set.getValue()>(arr.length/3)){
                list.add(set.getKey());
            }
        }

        System.out.println(list);

    }
}
