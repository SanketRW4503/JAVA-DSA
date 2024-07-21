


//print numbers in reverse order till 1 ... if n=3 , output should be 5 4 3 2 1
public class PrintRevNumbers {

    public static void main(String[] args) {
        int n =10;

        printNumbers(n);
    }
    public static void printNumbers(int n){

            //end condition
            if(n==0){
                return;
            }


            System.out.println(n);

            //recall
            printNumbers(n-1);
    }
}
