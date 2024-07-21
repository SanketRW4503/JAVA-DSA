//https://www.geeksforgeeks.org/problems/factorial-number2446/1

public class ISfactorial {
    public static void main(String[] args) {

        int n =5;

        System.out.println(isFactorial(n));

    }

    public static int isFactorial(int n ){


        int ans =1;
      
        for(int i =1;i<=n;i++){
            ans= ans*i;
            if(ans==n){
                
                return 1;
            }    

            if(ans>n){
                return 0;
            }
        }

        return 0;

    }
    
}
