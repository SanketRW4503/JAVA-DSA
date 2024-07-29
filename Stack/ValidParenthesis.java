//https://leetcode.com/problems/valid-parentheses/

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

        public static void main(String[] args) {
            
            String str="(())";

            System.out.println(isValid(str));

        }

        public static  boolean isValid(String str) {
        
        if(str.length()==1){
            return false;
        }

        Map<Character,Character> map= new HashMap<>();
        Stack<Character> stack= new Stack<>();

        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for(int i =0;i<str.length();i++){

           if(map.containsKey(str.charAt(i))){
                stack.push(str.charAt(i));
           }else{

                if(stack.empty()==false && map.get(stack.peek())==str.charAt(i)){
                    stack.pop();
                }else{
                    return false;
                }
           }

        }

        if(stack.empty()){
            return true;
        }
        return false;

    }
    
}