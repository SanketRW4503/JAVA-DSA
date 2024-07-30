import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CountSmallerElement {
    public static void main(String[] args) {
        
        int []arr={1,9,7,8,5};

        System.out.println(getSmaller(arr));

    }

    public static List<Integer> getSmaller(int []arr){


        Stack<Integer> stack= new Stack<>();

        Stack<Integer> ans= new Stack<>();


        List<Integer> list = new ArrayList<>();



        for(int i =arr.length-1;i>=0;i--){
            int count=0;
           
                while (stack.empty()!=true) {
                        if(stack.peek()<arr[i]){
                            count++;
                        }

                        if(stack.size()==1){
                            break;
                        }else{
                            stack.pop();
                        }
                }


                ans.push(count);
                stack.push(arr[i]);
            

        }

        while (ans.empty()!=true) {
            list.add(ans.pop());
        }

        return list;

    }
}
