
public class ConvertToLowerCase {
    public static void main(String[] args) {
        String str="LMNOppQQ";

        System.out.println(toLower(str));
    }


    public static String toLower(String str){
        String ansString="";
        for(int i =0;i<str.length();i++){

            if(str.charAt(i)<='Z'){
            char lower= (char) ((char) str.charAt(i)+32);
               ansString= str.replace(str.charAt(i),lower);
            }
 
        }

        return ansString;
    }
}
