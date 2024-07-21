public class CountEvenDigitSum {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        for (int i = 2; i <= num; i++) {
            
            int temp=i;
            int sum=0;
            while(0<temp){
                
                
                sum=sum+(temp%10);
                temp=temp/10;
            } 

            if(sum%2==0){
                count++;
            }
        }

        System.out.println(count);

       

    }
}
