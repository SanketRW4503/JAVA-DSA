
public class MaxSubsequenceLeetcode {

    public static void main(String[] args) {

        int[] arr = {1,2,1,1,2,1,2};

        int x = 2;

        int temp = (arr[0] + arr[1]) % 2;

      

        if (arr.length > 2) {
             int first=1;
             int second=2;
            while (second<arr.length) {
                
                if((arr[first]+arr[second])%2==temp){
                    x++;
                  
                }
                      first++;
                    second++;


            }

        }



        System.out.println(x);

    }

}