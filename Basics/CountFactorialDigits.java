import java.math.BigInteger;

public class CountFactorialDigits {
    public static void main(String[] args) {

        int n =27;

        BigInteger factorial= getFactorial(n);

        int count =0;
        while (!factorial.equals(BigInteger.ZERO)) {
            factorial=factorial.divide(BigInteger.TEN);
            count++;
          
        }

        
        System.out.println(count);

    }

    public static BigInteger getFactorial(int n){

        if(n==0){
            return BigInteger.ZERO;
        }

         BigInteger ans=BigInteger.ONE;



        
         for(long i =1;i<=n;i++){
            BigInteger a=BigInteger.valueOf(i);
            ans= ans.multiply(a);
         }

        


    return ans;

    }
}
