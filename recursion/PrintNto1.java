//pritn N to 1 using recursion but without using n-1 (use backtrack)


class PrintNto1{
    public static void main(String[] args) {
        int n =5;    
        printNumbers(n,n);
    }


    public static void printNumbers(int i , int n){

        //end condition
        if(n<i){
            return ;
        }

        //recall
        printNumbers(i+1, n);
        System.out.println(i);
    }


}