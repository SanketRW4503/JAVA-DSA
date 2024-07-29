import java.util.Stack;

/**
 * PostFixExpression
 */
public class PostFixExpression {

    public static void main(String[] args) {
        String str="231*+9-";

        System.out.println(evaluatePostFix(str));
    }

     public static int evaluatePostFix(String str)
    {
        // Your code here
        Stack<Integer> stack = new Stack<>();
        

        for(int i =0;i<str.length();i++){

            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                int temp= Character.getNumericValue(str.charAt(i));
                stack.push(temp);
                continue;
            }else if(stack.size()>=2){

                int num2= stack.pop();
                int num1= stack.pop();

                stack.push(cal(num1,num2,str.charAt(i)));

                
            }


        }

        return stack.pop();
    }
    public static int cal(int n1 ,int n2, char op){
        
        if(op=='+'){
            return n1+n2;
        }else if(op=='*'){
            return n1*n2;
        }else if (op=='/'){
            return n1/n2;
        }
    
        return n1-n2;
        
    }
}