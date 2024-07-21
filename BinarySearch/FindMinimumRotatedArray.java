public class FindMinimumRotatedArray {
    public static void main(String[] args) {

        int []arr={1,2,3,0,0,1,1};

        System.out.println(findMin(arr));

    }

     public static int findMin(int[] arr) {

            int start=0;
            int end= arr.length-1;

            int ans = Integer.MAX_VALUE;

            while(start<=end){
                int mid = start+(end-start)/2;

                if(arr[start]<=arr[mid] && arr[mid]<=arr[end]){
                    ans= Math.min(ans,arr[start]);
                    break;
                }

                if(arr[start]<=arr[mid]){
                    //left half is sorted
                     ans= Math.min(ans,arr[start]);
                     start=mid+1;
                }else{
                    ans= Math.min(ans,arr[mid]);
                    end=mid-1;

                }

            }

    return ans ;
    }
}
