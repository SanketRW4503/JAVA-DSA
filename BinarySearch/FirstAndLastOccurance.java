
public class FirstAndLastOccurance {
    public static void main(String[] args) {
        
        int []arr={0 ,0, 1 ,1 ,2 ,2, 2, 2};
        int target=2;
        int first= firstOccurance(arr, target);
        if(first==-1){
            System.out.println("-1,-1");
        }else{
            int last =lastOccurance(arr, target);
            System.out.println(first+","+last);
        }


    }

    public static int lastOccurance(int []arr , int target){

        int start=0;
        int end =arr.length-1;
        int last=-1;

        while (start<=end) {

            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                last=mid;
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return last;
    }



    public static int firstOccurance(int []arr,int target){

        int start=0;
        int end =arr.length-1;
        int first=-1;

        while (start<=end) {

            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                first=mid;
                end=mid-1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }

        return first;
    }
}
