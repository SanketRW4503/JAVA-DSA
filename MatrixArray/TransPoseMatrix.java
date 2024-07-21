//https://leetcode.com/problems/transpose-matrix/submissions/

public class TransPoseMatrix {
    public static void main(String[] args) {

       int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};

       int cols=arr[0].length;
       int rows=arr.length;

       int[][] ansMat= new int[cols][rows];

       for(int i =0;i<rows;i++){

            for(int j =0;j<cols;j++){

                   ansMat[j][i]= arr[i][j];
            }

       }

       print(ansMat, cols,rows);



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
