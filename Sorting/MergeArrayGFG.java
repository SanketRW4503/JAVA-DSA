import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrayGFG {

    public static void main(String[] args) {

        int arr[][] = {{1}};
        int k = 4;

        ArrayList<Integer> list = new ArrayList<>();
   
        if(1<=k){
             for (int[] row : arr) {
          
            
            // Iterate through each element of the current row
            for (int element : row) {
       
                list.add(element);
            }
            
        }
                   System.out.println(list);

        }

        // first initial send two arrays for sorting
        merge(Arrays.copyOf(arr[0], arr[0].length), Arrays.copyOf(arr[1], arr[1].length), list);


        for (int i = 2; i < k; i++) {
            int[] array = new int[list.size()];
            for (int j = 0; j < list.size(); j++) {
                array[j] = list.get(j);
            }        
            list.clear();

            merge(array, Arrays.copyOf(arr[i], arr[i].length), list);

        }

        System.out.println(list);

    }

    public static ArrayList<Integer> merge(int[] nums1, int[] nums2, ArrayList list) {

        int left = 0;
        int right = 0;

        // merge two arrays in a sorted manner
        while (left < nums1.length && right < nums2.length) {

            if (nums1[left] <= nums2[right]) {
                list.add(nums1[left]);
                left++;
            } else {
                list.add(nums2[right]);
                right++;

            }

        }

        // add remaining left elements to the temporarry array
        while (left < nums1.length) {

            list.add(nums1[left]);
            left++;

        }

        // add remaining right elements to the temporarry array
        while (right < nums2.length) {

            list.add(nums2[right]);
            right++;

        }

        return list;

    }

}