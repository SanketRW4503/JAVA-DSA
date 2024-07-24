//https://leetcode.com/problems/median-of-two-sorted-arrays/description/


import java.util.Arrays;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        
        int []arr1 = {1,2};
        int []arr2 = {3,4};
        int []ans= new int [arr1.length+arr2.length];

        int count =0;

        while(count<arr1.length){
            ans[count]=arr1[count];
            count++;
        }
        int count2=0;
        while(count2<arr2.length){
            ans[count]=arr2[count2];
            count++;
            count2++;
        }

        Arrays.sort(ans);
        int len =ans.length-1;
        int temp=len/2;
        System.out.println(temp);
        double mid =0;
        if(len%2==0){
            
            mid= ans[temp];
            
        }else{
            double value=ans[temp]+ans[temp+1];
            mid= value/2.0;
        }
        System.out.println(mid);

    }
}