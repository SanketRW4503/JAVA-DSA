import java.util.ArrayList;
import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        
        int [][] arr = {
            {13, 32, 8},
            {37, 14, 26},
            {29, 16, 45},
            {32, 23, 29},
        };

        int n =arr.length;
        int m =arr[0].length;

        int top=0;
        int left=0;
        int right=m-1;
        int bottom=n-1;

        int [] ans= new int[n*m];
        int count =0;
        while (left<=right && top<=bottom) {
            
    

                //left to right 
                for(int i =left;i<=right;i++){
                    ans[count]= arr[top][i];
                    count++;
                }

                top++;

                //top to bottom
                for(int i=top;i<=bottom;i++){
                    ans[count]=arr[i][right];
                    count++;
                }

                //right to left
                right--;
                if(left<=right){
                    for(int i =right;i>=left;i--){

                        ans[count]=arr[bottom][i];
                        count++;
                    }
                 
                }
                    //bottom to top

                    bottom--;
                    for(int i=bottom;i>=top;i--){
                        ans[count]=arr[i][left];
                        count++;
                    
                }
                    
                    left++;
             
            
        }



        System.out.println(Arrays.toString(ans));

    }
}
