public class SecondLargest {

    public static void main(String[] args) {
        int secondLargest = -1;
        int arr[] = { 12, 35, 1, 10, 34, 36,35,1 };
        int n = arr.length;
       
        if (0 < n) {

            int largest = arr[0];

            for (int i = 0; i < n; i++) {
                if (arr[i] > largest ) {
                    secondLargest = largest;
                    largest = arr[i];
                }

                if(arr[i]>secondLargest && arr[i]<largest){
                    secondLargest =arr[i];
                }
            }
        }

        System.out.println(secondLargest);

    }
}
