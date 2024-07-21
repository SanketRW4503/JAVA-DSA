public class SummationOFNnumber {
    public static void main(String[] args) {
        int n =10;


        System.out.println(summation(n, 0));
        
    }

    public static int summation(int n , int sum){

        //end condition
        if(0==n){
            return sum;
        }

        //recall
       return  summation(n-1, sum+n);
    }
}
