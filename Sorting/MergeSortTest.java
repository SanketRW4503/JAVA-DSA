import java.util.Arrays;

public class MergeSortTest {
    
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};

        int k =arr.length;

        mergeSort(arr, 0, k-1);
        System.out.println(Arrays.toString(arr));


    }

    public static void mergeSort(int [] arr,int l , int h){
        

        //end condition
        if(l>=h){
            return;
        }

        //calculate the mid
        int mid= l+(h-l)/2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, h);


        //merge the sorted array
        merge(arr, l , mid, h);

    }

    public static void merge(int []arr,int l ,int mid , int h){

        if(l>=h){
            return;
        }

        int [] temp= new int[h - l + 1];
        int left =l;
        int right = mid+1;


        //check two arrays and merge them into temp array
        int count =0;
        while (left<=mid&& right<=h) {
            if(arr[left]<=arr[right]){
                temp[count]=arr[left];
                left++;
            }else{
                temp[count]=arr[right];
                right++;
            }
            count++;
        }

        //check right is remaining or not if yes add it to the temp array
        while (left<=mid) {
            temp[count]=arr[left];
            left++;
            count++;
        }

        while (right<=h) {
            temp[count]=arr[right];
            right++;
            count++;
        }


       
         for(int i :temp){
            
            arr[l]=i;
            l++;
         }
    }

}
