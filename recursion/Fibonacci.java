import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        
        int n =10;
        ArrayList list= new ArrayList<>();
        System.out.println(getFibonacci(n, list, 0, 1, 0));

    }

    public static ArrayList<Integer> getFibonacci(int n , ArrayList<Integer>list, int i, int j, int c){

        //end condition
        if(c>n){
            return list;
        }

        list.add(i);
        list.add(j+i);
        i=j;
        j=j+i;

        //recall
        return getFibonacci(n, list, i, j, ++c);
    }
}
