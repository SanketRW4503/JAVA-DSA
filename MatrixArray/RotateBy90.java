
public class RotateBy90 {

    public static void main(String[] args) {

       int [][]mat= {{1, 2}, {3, 4}};


       int len=mat.length;

       int [][]ansMat=new int [len][len];

       for(int i =0;i<len;i++){

            for(int j=0;j<len;j++){

                ansMat[j][(len-1)-i]=mat[i][j];
            }

       }
        
       print(ansMat, len, len);


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
