
// Given a Integer array A[] of n elements. Your task is to complete the function PalinArray.
// Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.


public class PalindromeArray {
    public static void main(String[] args) {

        int arr[] = { 111, 222, 333, 444, 555,20 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            
                        int temp = arr[i];
                        int ans = 0;
                            while (temp != 0) {

                                int lastdigit = temp % 10;
                    
                                ans = (ans * 10) + lastdigit;
                    
                                temp = temp / 10;

                             }
        
                        if (ans == arr[i]) {
                           System.out.println("return 0");
                        }
        }

        System.out.println("return 1");
    }

}
