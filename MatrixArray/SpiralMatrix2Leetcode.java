//https://leetcode.com/problems/spiral-matrix-ii/description/

public class SpiralMatrix2Leetcode {
    public static void main(String[] args) {

        int n = 5;
        int target = n * n;

       

        int [][] ansArray= new int[n][n];

        int top=0;
        int right=n-1;
        int bottom=n-1;
        int left=0;

        int count =1;

        while (left<=right && top<=bottom && count<=target) {
        
        

                //left to right
                for(int i =left;i<=right;i++){
                    ansArray[top][i]=count;
                    count++;
                }
                //top to bottom
                top++;
                for(int i =top;i<=bottom;i++){
                    ansArray[i][right]=count;
                    count++;
                }

                //right to left
                right--;
                if(top<=bottom){
                for(int i =right;i>=left;i--){
                    ansArray[bottom][i]=count;
                    count++;
                }
             }

                //bottom to top
                bottom--;
                if(left<=right){
                for(int i =bottom;i>=top;i--){
                    ansArray[i][left]=count;
                    count++;
                }
                }

                left++;
            }


            print(ansArray, n, n);
    }

     public static void print(int [][]arr,int n,  int m){
  //printing
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){

                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }

    }

}
