
// https://bit.ly/3Mdw2FX 

import java.util.ArrayList;

public class FirstAndLastOccuranceCodeStudio {
    
   public static void main(String[] args) {
     int [] input= {0,1,1,5};
    ArrayList<Integer> arr=new ArrayList<>();
    int target=1;
    for(int i :input){
        arr.add(i);
    }

    int first= firstO(arr, target);

    if(first==-1){
        System.out.println("-1,-1");
    }else{
        int last=lastO(arr, target);
        System.out.println(first +","+last);
    }
   }

   public static int lastO(ArrayList<Integer>arr, int target){
    int start=0;
    int end =arr.size()-1;
    int last=-1;

    while (start<=end) {

        int mid = start+(end-start)/2;

        if(arr.get(mid)==target){
            last=mid;
            start=mid+1;
        }else if (arr.get(mid)>target){
            end=mid-1;
        }else{
            start=mid+1;
        }
    }

    return last;
   }

   public static int firstO(ArrayList<Integer> arr, int target){

    int start=0;
    int end =arr.size()-1;

    int first=-1;

    while (start<=end) {

        int mid = start+(end-start)/2;

        if(arr.get(mid)==target){
            first=mid;
            end=mid-1;
        }else if (arr.get(mid)>target){
            end=mid-1;
        }else{
            start=mid+1;
        }

    }

    return first;


   }



}
