

import java.util.HashMap;

public class SubArrayWithSum {
    public static void main(String[] args) {

        
        int[] arr = {
            -913, 857, 492, 366, 937, -550, 229, 408, -120, -394,
            238, 794, -427, 12, -528, -403, 764, 539, -839, -817,
            -687, 918, 997, -742, -182, -498, -724, -589, 140, -785,
            83, -463, 508, 805, -610, -827, 344, -567, -421, 811,
            802, 731, -304, -735, -625, -464, -415, -257, -636, -623,
            -35, -898, 551, -70, 132, 931, 895, -162, 982, 997,
            774, 669, -94, -465, -339
        };


        int n= arr.length; 
        int k = 0;
        int len=0;
        long sum=0;
        
        HashMap<Long,Integer> map= new HashMap<>();

        for(int i =0;i<arr.length;i++){
                //update the sum
                sum=sum+arr[i];

                //check if it's equal
                if(sum==k){
                        len=i+1;
                }

                if(sum>k){
                    //check how many require
                    long rem= sum-k;
                    
                    if(map.containsKey(rem)){
                        int temp=i-map.get(rem);
                        if(temp>len){
                            len= temp;
                        }
                        
                    }

                }
                if(!map.containsKey(sum)){
                     map.put(sum, i);
                }


        }

        System.out.println(len);

    }
}
