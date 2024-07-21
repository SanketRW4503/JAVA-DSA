//https://leetcode.com/problems/reverse-string/submissions/1286924356/

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
       char[] s = {'h','e','l','l','o'};
    
       int start=0;
       int end=s.length-1;
       
       while (start<=end) {
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;

            start++;
            end--;
       }

       System.out.println(Arrays.toString(s));

    }

}
