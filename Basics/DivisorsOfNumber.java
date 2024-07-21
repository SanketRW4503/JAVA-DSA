import java.util.ArrayList;
import java.util.List;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        
        List<Integer> list= new ArrayList<Integer>();
        int n =5;
        for(int i =1;i<=n;i++){

            if(n%i==0){
                list.add(i);
            }

        }

        System.out.println(list);
    }
}
