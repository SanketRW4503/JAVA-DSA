public class FindKSpiralMatrix {
    public static void main(String[] args) {

          int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n= arr.length;
        int m = arr[0].length;
        int k =9;

        System.out.println(findk(arr, n, m, k));
    
    }


    public static int findk(int [][] arr, int n , int m, int k ){
            int count =0;

        int top=0;
        int left=0;
        int right=m-1;
        int bottom=n-1;

        
        while (top<=bottom && left<=right) {
            
   
                    //left to right 
                    for(int i =left;i<=right;i++){ 
                        count++;

                        if(count==k){
                            return arr[top][i];
                        
                        }

                    }

                    //top to bottom 
                    top++;

                    for(int i =top;i<=bottom;i++){
                        count++;

                        if(count==k){
                        return arr[i][right];
                        }

                    }

                    //right to left
                    right--;
                    if(top<=bottom){
                        for(int i =right;i>=left;i--){
                            count++;

                            if(count==k){
                                return arr[bottom][i];
                
                            }


                        }
                    }

                    //bottom to top
                    bottom--;

                    if(left<=right){
                    for(int i=bottom;i>=top;i--){
                                                count++;

                        if(count==k){
                            return arr[i][left];
                        }

                    }
                }
                    left++;
        }


    return -1;
    }
}
