import java.util.ArrayList;

public class SuperiorElement {
    public static void main(String[] args) {
        int [] arr = {5,4,3} ;

        int n =arr.length;

        System.out.println(FindSuperiorElements(arr, n));

    }

    public static ArrayList<Integer> FindSuperiorElements(int []arr , int n ){

        ArrayList<Integer> list= new ArrayList<>();

        int max=-1;

        for(int i =n-1;i>=0;i--){

                if(arr[i]>max){
                    max=arr[i];
                    list.add(max);
                }

        }

        
        int start=0;
        int end =list.size()-1;
        while (start<end) {

            int temp= list.get(end);
            list.set(end, list.get(start));
            list.set(start, temp);
            
            start++;
            end--;
            
        }   


        return list;


    }
}
