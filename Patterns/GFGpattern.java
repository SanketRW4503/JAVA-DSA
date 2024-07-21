

//You are given a number N. You need to print the pattern for the given value of N.

//For N = 2 the pattern will be
// 3 3 3 2 2 2 1 1 1
// 3 3 2 2 1 1
// 3 2 1


//https://www.geeksforgeeks.org/problems/print-the-pattern-set-1/1?page=1&difficulty=School&sortBy=submissions

public class GFGpattern {
    public static void main (String []args){

        printPattern(2);

    }

    public static void printPattern(int n){

        for(int i=n;i!=0;i--){

            for(int j=n;j!=0;j--){
                
                for(int k=0;k<i;k++){
                    System.out.print(j+" ");
                }
            }
            System.out.print("$");
        }

    }
}
