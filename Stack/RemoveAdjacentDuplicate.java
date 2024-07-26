
// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/

import java.util.Stack;

public class RemoveAdjacentDuplicate {
 
    public static void main(String[] args) {
        
        String s = "azxxzy";

        Stack<Character> stack= new Stack<>();
        
        for(int i =0;i<s.length();i++){
            if( stack.empty()==false &&stack.peek()==s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }

        String ans ="";

        for(int i=stack.size();i!=0;i--){
           ans=stack.pop()+ans;
        }

        System.out.println(ans);


    }
}
