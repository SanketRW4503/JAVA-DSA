

//https://leetcode.com/problems/valid-palindrome/submissions/1286185740/

public class PalindromString {
    public static void main(String[] args) {
        
        String str="A man, a plan, a canal: Panama";
       
        str = str.replaceAll("[^a-zA-Z0-9]", "");  
        str = str.toLowerCase();
        System.out.println(str);
        //first way
        System.out.println(checkPalindrom(str,"",str.length()-1));
        //second way
        System.out.println(checkPalindrom2(str, 0, str.length()-1));
    }   

    public static boolean checkPalindrom(String str,String ans,int i){
  
        //end condition
        if(i<0){
            if(str.equals(ans)){
                return true;
            }
            return false;
        }

        //main operation
        ans=ans+Character.toString(str.charAt(i));
        
        //recall
        return checkPalindrom(str, ans,i-1);


    }


    public static boolean checkPalindrom2(String str,int start, int end){

        //end condition
        if(start>=end){
            return true;
        }

        //main operation
        if(str.charAt(start)==str.charAt(end)){
            //recall
           return checkPalindrom2(str, ++start, --end);
        }

        return false;

    }



}
