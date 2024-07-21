
//https://www.geeksforgeeks.org/problems/count-of-smaller-elements5947/1?page=1&difficulty=School&sortBy=submissions

public class CountSmallerElements {
    
    public static void main(String[] args) {
            int [] arr= {1, 2, 2, 2, 5, 7, 9};
            int N= arr.length;
            int X=2;

            int count =0;

            for(int i =0;i<N;i++){

                if(arr[i]<=X){
                    count++;
                }
            }

            System.out.println(count);
    }   
}
