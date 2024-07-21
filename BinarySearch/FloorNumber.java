//https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/0
public class FloorNumber {
    public static void main(String[] args) {
        
        int []arr={1,2,8,10,11,12,19};

        int target=2;

        int ans =-1;
        int start=0;
        int end= arr.length-1;

        while (start<=end) {

            int mid = start+(end-start)/2;

            if(arr[mid]==target){

                System.out.println(mid);
                break;
            }

            if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        System.out.println(end);

    }
}
