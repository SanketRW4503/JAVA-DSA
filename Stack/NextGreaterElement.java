import java.util.Arrays;
import java.util.Stack;

/**
 * NextGreaterElement
 * https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
 */
public class NextGreaterElement {

    public static void main(String[] args) {
        
        long [] arr={6, 8, 0, 1 ,3};


        System.out.println(Arrays.toString(nextGreaterElement(arr)));

    }

    public static long[] nextGreaterElement(long []arr){

        Stack<Long> stack = new Stack<>();

        long [] ans= new long[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            if(stack.empty()){
                ans[i]=-1;
            }else{
                if(stack.peek()>arr[i]){
                    ans[i]=stack.peek();
                }else{

                    while ( stack.empty()!=true) {
                        if(stack.peek()>arr[i]){
                               ans[i]=stack.peek();
                               break;
                         }

                        stack.pop();
                        
                    }

                    if(stack.empty()){
                      ans[i]=-1;
                    }

                }

            }
                      stack.push(arr[i]);

        }


        return  ans;


    }
    

}