public class SubArrayZeroSum {
    public static void main(String[] args) {
        
        int []arr={4,2,-1,0};
        int k =0;
        
        int left =0;
        int right =0;
        int sum=0;
        while (right<arr.length) {

            
            if(sum==k){
                System.out.println("yes");
                break;
            }

            sum=sum+arr[right];

            
            if(sum>k && right!=0){
                sum=sum-arr[left];
                left++;
            }
            right++;

        }   


    }
}
