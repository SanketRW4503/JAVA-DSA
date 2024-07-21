

public class Search2dMatrix {

    public static void main(String[] args) {

        int [][]arr={{10, 20 ,30, 40},{ 15, 25 ,35, 45}, {27, 29, 37, 48},{ 32, 33, 39, 50}};
        int n =arr.length;
        int m= arr[0].length;
        int start=0;
        int end = (n*m)-1;
        int target=37;

        while(start<=end){


            int mid = start+(end-start)/2;
            System.out.println(mid);
            int rows= mid/m;
            int cols=mid%m;

            if(arr[rows][cols]==target){
                System.out.println(true);
                break;
            }

            if(arr[rows][cols]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }


        }

        System.out.println(false);

    }

}