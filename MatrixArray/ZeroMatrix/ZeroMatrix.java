

//bruit force solution 

//https://www.geeksforgeeks.org/problems/boolean-matrix-problem-1587115620/1

package MatrixArray.ZeroMatrix;

import java.util.Arrays;

public class ZeroMatrix {
    public static void main(String[] args) {

        int [][] arr={{ 1, 0, 0},
              { 1, 0, 0},
              { 1, 0, 0},
              { 0, 0, 0}};

        int n=arr.length;
        int m=arr[0].length;

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){

                if(arr[i][j]==1){
                    setCols(arr, j,n);
                    setRows(arr, i,m);
                }
            }
        }


        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){

                    if(arr[i][j]==-1){
                        arr[i][j]=1;
                    }

            }
        }
        
        print(arr,n,m);
        

    }

    public static void print(int [][]arr,int n,  int m){
  //printing
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){

                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }

        System.out.println("--------------");
    }

    public static void setCols(int [][]arr, int j ,int n){

        for(int i =0;i<n;i++){
            if(arr[i][j]!=1){
                arr[i][j]=-1;
            }
        }

    }
       public static void setRows(int [][]arr, int i , int m ){

        for(int j =0;j<m;j++){
            if(arr[i][j]!=1){
                arr[i][j]=-1;
            }
        }

    }
}
