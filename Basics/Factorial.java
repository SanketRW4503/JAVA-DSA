//https://www.geeksforgeeks.org/problems/factorial5739/1

public class Factorial {
    public static void main(String[] args) {
        
        int  n=0;

    
        System.out.println(findFactorial(n));

    }   

    public static long findFactorial(int n){
        //end condition
        if(n<1){
            return 0;
        }
        
        if(n==1){
            return 1;
        }

        return n*findFactorial(n-1);

    }
}
