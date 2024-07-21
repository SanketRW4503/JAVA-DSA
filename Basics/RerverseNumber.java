public class RerverseNumber {
    public static void main(String[] args) {
        
        int number=10400;
        int rev=0;
        while(0<number){

            int lastdigit= number%10;
            rev= (rev*10)+lastdigit;
            number=number/10;
        }

        System.out.println(rev);

    }
}
