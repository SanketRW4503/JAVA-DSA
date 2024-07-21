
//https://www.geeksforgeeks.org/problems/count-numbers-containing-43022/1

public class CoutFour {
    public static void main(String[] args) {
        
        int n=44;
        int count =0;
        for(int i =4;i<=n;i++){

            int temp=i;
            while (0<temp) {
                
                int lastdigit = temp%10;

                if(lastdigit==4){
                    count++;
                    break;
                }
                temp=temp/10;
            }
            
        }

        System.out.println(count);
    }
}
