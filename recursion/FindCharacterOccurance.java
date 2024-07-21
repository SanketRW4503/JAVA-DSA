import java.util.Arrays;

public class FindCharacterOccurance {
    public static void main(String[] args) {
        String str="soaa";

        int [] charhash=new int[26];

       
        for(int i=0;i<=str.length()-1;i++){
            
            charhash[str.charAt(i)-'a']+=1;
            
        }
        
      System.out.println(Arrays.toString(charhash));

    }
}
