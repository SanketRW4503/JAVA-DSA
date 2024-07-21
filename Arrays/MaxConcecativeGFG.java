

//https://www.geeksforgeeks.org/problems/longest-consecutive-1s-1587115620/1

public class MaxConcecativeGFG {
    public static void main(String[] args) {
        
        int n=222;

        String binaryNum= Integer.toBinaryString(n);
        
        int max=0;
        int count=0;

        for(int i =0;i<binaryNum.length();i++){
            if(binaryNum.charAt(i)=='1'){
                count++;
                if(count>max){
                    max=count;
                }
            }else{
                count=0;
            }
        }


        System.out.println(max);
        
    }
}
