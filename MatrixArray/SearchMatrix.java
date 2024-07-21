
public class SearchMatrix {
        public static void main(String[] args) {
            int [][] arr={{18,21,26,32,30,2}};

            int n=arr.length;
            int m= arr[0].length;
            int x=30;
            
            System.out.println(matSearch(arr, n, m, x));
            

        }

    public static int matSearch(int mat[][], int n, int m, int x)
    {       // your code here

            for(int i =0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(mat[i][j]==x){
                        return 1;
                    }
                }
            }

            return 0;

    }
}
