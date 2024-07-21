
//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/

import java.util.Arrays;

public class SuperiorElement2 {
    public static void main(String[] args) {

        int[] arr = { 400 };

        replaceElement(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void replaceElement(int[] arr) {

        int n =arr.length;

        int max=arr[n-1];

        for(int i =n-2;i>=0;i--){
                int temp =arr[i];
                arr[i]=max;
            if(temp>max){

                max=temp;
            }

        }

        arr[n-1]=-1;

        

    }
}
