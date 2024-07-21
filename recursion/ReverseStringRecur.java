
//https://leetcode.com/problems/reverse-string/submissions/1286932255/
import java.util.Arrays;

public class ReverseStringRecur {
    
    public static void main(String[] args) {
        
        char[] s = {'h','e','l','l','o'};

        s=revString(s, 0, s.length-1);
        System.out.println(Arrays.toString(s));

    }

    public static char[] revString(char []arr,int start, int end){

        //end condition
        if(start>=end){
            return arr;
        }

        //main operation
        char temp=arr[start];
        arr[start]=arr[end];
        arr[end]= temp;
        // recall
        return revString(arr, ++start, --end);
    }

}
