
//print numbers till n using recursion
public class PrintNumbersRecur {
    
    public static void main(String[] args) {
        int n =20;
        printNumbers(0,n);
    }

    public static void printNumbers(int i , int n){
        //end condition
        if(i>n){
            return ;
        }

        System.out.println(i);

        //recall
        printNumbers(i+1, n);
    }
}

