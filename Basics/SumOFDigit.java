public class SumOFDigit {
    public static void main(String []args){

        int number=12;

        System.out.println(sumOfDigits(number));
    }

     public  static int sumOfDigits(int n) {
        // code here
        int sum=0;
        while (n!=0) {

            int lastdigit= n%10;

            sum= sum+lastdigit;

            n= n/10;

        }

        return sum;
    }
}
