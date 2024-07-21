
//for unique  numbers rotated binary search 
public class SearchRotatedArray {
    public static void main(String[] args) {
        
        int []arr={7,8,1,2,3,4,5};

        int target=7;

        System.out.println(searchRotatedBS(arr, target));
        
    }

    public static int searchRotatedBS(int []arr, int target){

        int start=0;
        int end =arr.length-1;

        while (start<=end) {
                
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[start]<=arr[mid]){
                //left half is sorted

                if(arr[start]<=target && target<=arr[mid]){
                    //eliminate right half
                    end= mid-1;
                }else{
                    //eliminate left half
                    start=mid+1;
                }

            }else{

                //right half is sorted

                if(arr[mid]<=target && target<=arr[end]){
                    //eliminate left half
                    start=mid+1;
                }else{
                    //eliminate right half
                    end=mid-1;

                }


            }

        }



        return -1;
    }
}
