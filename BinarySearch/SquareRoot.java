public class SquareRoot {
    public static void main(String[] args) {
        

        int n =2147395599;

        System.out.println(sqrtbs(n));

    }

    public static int sqrtbs(int n ){

        long start=1;
        long end =n;
        int ans=0;
        while (start<=end) {

            long mid = start+(end-start)/2;

            if((mid*mid)<=n){
                ans=(int) mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }


        return ans;


    }


}
