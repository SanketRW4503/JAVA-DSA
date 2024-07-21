

//https://www.geeksforgeeks.org/problems/majority-element-1587115620/1

public class MajorityElement {
    public static void main(String[] args) {

        int [] arr= {3,1,3,3,2};
        int n=arr.length;
        int element=-1; 
        int count =0;

        for(int i =0;i<n;i++){

            if(count==0){
                element=arr[i];
                count++;
            }else if(arr[i]==element){
                count++;
            }else{
                count--;
            }


        }

       count =0;
       for(int i =0;i<n;i++){
            if(arr[i]==element){
                count++;
            }
       }

       if(count>(n/2)){
         System.out.println(element);
       }else{
        System.out.println(-1);
       }


    }
}
