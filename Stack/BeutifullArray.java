import java.util.ArrayList;
import java.util.Stack;

public class BeutifullArray {
    
    public static void main(String[] args) {
        int []arr={-1};

        System.out.println(makeBeautiful(arr));

    }
    

      public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        boolean positive =true;
        
        if(arr[0]<0){
            positive=false;
        }
        
        Stack<Integer> stack= new Stack<>();
        
        stack.push(arr[0]);
        
        for(int i =1;i<arr.length;i++){
            
            if(positive==true){
                if(arr[i]>=0){
                   stack.push(arr[i]);
                }else{
                    if(stack.empty()==true){
                        stack.push(arr[i]);
                        positive=false;
                    }else{
                        stack.pop();
                    }
                }
            }else{
                if(arr[i]<0){
                    stack.push(arr[i]);
                }else{
                    if(stack.empty()==true){
                        stack.push(arr[i]);
                        positive=true;

                    }else{
                        stack.pop();
                    }
                }
                
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
       

        if( stack.size()!=0){
            int []temp= new int[stack.size()];
            int count =0;

            while(stack.empty()!=true){
                temp[count]=stack.pop();
                count++;
            }

            for(int i =0;i<temp.length;i++){
                list.add(temp[i]);
            }
            
        }
        
        
        
        return list;
        
        
    }
}
