

public class PrintAlternative {
    
    public static void main(String[] args) {
        int []arr={1, 2, 3, 4,5};
        int n =arr.length;
        print(arr, n);
    }

    public static void print(int arr[], int n)
    {
        // your code here
        for(int i =0;i<n;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
