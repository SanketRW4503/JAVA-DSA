import java.util.Arrays;

public class FindingMedian {

        public static void main(String[] args) {
            

            int [] arr={56 ,67, 30 ,79};

            mergeSort(arr, 0, arr.length-1);

            if((arr.length-1)%2==0){
                System.out.println(arr[(arr.length-1)/2]);
            }else{
                int mid= (arr.length-1)/2;

                int ans= (arr[mid]+arr[mid+1])/2;
                System.out.println(ans);
            }

        }


        public static void mergeSort(int []arr, int l, int h){

                //end condition
                if(l>=h){
                    return ;
                }

                //take middle
                int m=l+(h-l)/2;

                mergeSort(arr, l, m);
                mergeSort(arr, m+1, h);

                merge(arr, l,m,h);
        }


        public static void merge(int[] arr, int l , int m  , int h){


            if(l>=h){
                return ;
            }

            int left=l;
            int right =m+1;

            int count=0;

        int [] temp= new int[h - l + 1];


            //compare two arrays and add value
            while (left<=m && right<=h) {

                if(arr[left]<=arr[right]){
                    temp[count]=arr[left];
                    left++;
                }else{
                    temp[count]=arr[right];
                    right++;
                }
                count++;
            }

            //add remaining left to the temporaarry array
            while (left<=m) {
                temp[count]=arr[left];
                left++;
                count++;
            }

            while (right<=h) {
                temp[count]=arr[right];
                right++;
                count++;
            }

           

            for(int i:temp){
                arr[l]=i;
                l++;
            }


        }


    
}
