public class RemoveDuplicates {
    public static void main(String[] args) {
        
        int []arr= {1, 1, 2 ,3, 3, 4, 5, 5 ,5  };
        int n =arr.length;

        

        int number=-1;
        int count =0;
        for(int i=0;i<n;i++){

            if(arr[i]!=number){
                number=arr[i];
                count++;
            }

        }

        System.out.println(count);
    }
}
