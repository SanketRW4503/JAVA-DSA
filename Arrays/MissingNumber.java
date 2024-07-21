//CODE STUDIO :https://www.naukri.com/code360/problems/missing-number_6680467
//GFG: https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
//GFG 2 :https://www.geeksforgeeks.org/problems/missing-number4257/1
public class MissingNumber {
    public static void main(String[] args) {
        
        int []arr={2, 5, 3, 1};
        int N= 5;

        
        int sumofarray=0;
        int sumofNumbers=0;
        
        for(int i =0;i<=N;i++){
            if(i<N-1){
                 sumofarray=sumofarray+arr[i];
            }
            sumofNumbers=sumofNumbers+i;

        }

        int missingNumber= sumofNumbers-sumofarray;

        System.out.println(missingNumber);

    }
}
