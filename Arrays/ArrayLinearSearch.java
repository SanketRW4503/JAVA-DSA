public class ArrayLinearSearch {

    public static void main(String[] args) {

        int[] arr = { 6, 7, 8, 4, 1 };
        int num = 10;
        int n = arr.length;


        System.out.println(linearSearch(n, num, arr));

    }

    public static int linearSearch(int n, int num , int []arr){


            for(int i =0;i<n;i++){
                if(arr[i]==num){
                    return i;
                }
            }

            return -1;
    }

}
