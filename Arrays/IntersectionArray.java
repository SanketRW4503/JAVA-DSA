import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * IntersectionArray
 */
public class IntersectionArray {

    public static void main(String[] args) {

        int[] nums1 = {4,9,5 };
        int[] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {

     
         HashSet<Integer> uSet = new HashSet<>();

       
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i =0;i< nums2.length ;i++){
            list.add(nums2[i]);
        }

        System.out.println(list);
        for(int i =0;i<nums1.length;i++){
            if(!list.contains(nums1[i])){
                uSet.add(nums1[i]);
            }
        }

               System.out.println(list);

       
        
       



        int [] arr= new int[uSet.size()];
        int count=0;
        for(int k :uSet){
            arr[count]=k;
            count++;
        }
        return arr;

    }

}