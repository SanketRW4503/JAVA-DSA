import java.util.Arrays;

public class MergeSortLeetCode{

    public static void main(String[] args) {
        
        int [] nums1={1,2,3,0,0,0};
        int [] nums2={2,5,6};

        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //create a temporarry array
        int [] temp=new int [m+n];
        int left=0;
        int right =0;
        int count =0;

        //merge two arrays in a sorted manner
        while(left<m && right<n){
            
            if(nums1[left]<=nums2[right]){
                temp[count]=nums1[left];
                left++;
            }else{
                temp[count]=nums2[right];
                right++;

            }
            count++;
        }

   

        //add remaining left elements to the temporarry array
        while(left<m){

             temp[count]=nums1[left];
                left++;
                count ++;
        }

         //add remaining right elements to the temporarry array
        while(right<n){

             temp[count]=nums2[right];
                right++;
                count ++;
        }


        //add all temp array data to the original nums1 array
        count=0;
        for(int i :temp){
            nums1[count]=i;
            count++;
        }

    }
}