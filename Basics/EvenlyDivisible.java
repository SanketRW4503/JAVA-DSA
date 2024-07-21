// https://www.geeksforgeeks.org/problems/count-digits5716/1

public class EvenlyDivisible {
    public static void main(String[] args) {
        int n=22074;
        int temp=n;
        int count=0;
        while(0<temp){

            int lastdigit= temp%10;

            if(lastdigit!=0 && n%lastdigit==0  ){
                count++;
            }
            temp=temp/10;
        }

        System.out.println(count);
    }
}
