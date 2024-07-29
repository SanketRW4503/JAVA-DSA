import java.util.ArrayList;
import java.util.Stack;

public class BracketNumber {
    public static void main(String[] args) {
        
        String str= "(aa(bdc))p(dee)";

        System.out.println(bracketNumbers(str));

    }

    public static ArrayList<Integer> bracketNumbers(String str) {
        // code here
        
        Stack<Character> stack = new Stack<>();
        Stack<Integer> closing= new Stack<>();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int opening=0;
        
        for(int i =0;i<str.length();i++){
            
            if(str.charAt(i)=='('){
                opening++;
                stack.push('(');
                closing.push(opening);
                list.add(opening);
                continue;
            }else if(str.charAt(i)==')'){
                list.add(closing.pop());
                stack.pop();
            }
                
        }
        
        return list;
        
    }
}
