public class SeriesAp {
    public static void main(String[] args) {
        
        int n =4;
        int a1=2;
        int a2=3;

        System.out.println(checkAp(a1, a2, n));
        

    }


    public static int checkAp(int a1,int a2,int n ){
        
        int dif= a2-a1;
        int ans=a2;

        if(n==1){
            return a1;
        }
        if(n==2){
            return a2;
        }

        for(int i =3;i<=n;i++){

             ans=ans+dif;
        }

       return ans;
    }
}
