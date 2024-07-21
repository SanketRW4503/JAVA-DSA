//https://www.geeksforgeeks.org/problems/palindrome0746/1

public class Palindrome {
    public static void main(String[] args) {
        
        int n=1211;
        int rev=0;
        int temp=n;
        while (0<temp) {
            
            int lastdigit= temp%10;
            
            rev=(rev*10)+lastdigit;

            temp=temp/10;
        }

        if(rev==n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
