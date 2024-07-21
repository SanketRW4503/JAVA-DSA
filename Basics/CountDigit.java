public class CountDigit {

    public static void main(String[] args) {

      int []arr={1, 3, 7, 9, 11, 12, 45};
      int target=1;

      System.out.println(bs(arr, 0, arr.length-1, target));

    }

    public static int bs(int []arr, int start, int end , int target){

        if(start>end){
            return -1;
        }

        int mid =start+(end-start)/2;

        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return bs(arr, start, mid-1, target);
        }else{
            return bs(arr, mid+1, end, target);
        }


    }


}