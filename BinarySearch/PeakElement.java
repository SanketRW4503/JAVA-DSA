public class PeakElement {
    public static void main(String[] args) {
        
        int [] arr={1, 1, 1, 1, 2, 1, 1};


        System.out.println(findPeak(arr));

    }


    public static int findPeak(int []arr){

    

        if(arr.length==1){
            return 0;
        }

        if(arr[0]>arr[1]){
            return 0;
        }
        if(arr[arr.length-1]>arr[arr.length-2]){
            return arr.length-1;
        }

        int start=1;
        int end =arr.length-2;

        while (start<=end) {

            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1]){
                return mid;
            }

            if(arr[mid]>arr[mid-1]){
                start=mid+1;
            }else if (arr[mid]>arr[mid+1]){
                end=mid-1;
            }else{
                start=mid+1;
            }


        }

        //this will never be executed 
        return -1;
    
    }

}
