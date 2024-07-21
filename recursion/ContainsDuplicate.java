

public class ContainsDuplicate {
    public static void main(String[] args) {
       int  [] nums = {1,5,-2,-4,0};
       int [] hashh= new int[nums.length*2];
       
       for(int i =0;i<=nums.length-1;i++){
        hashh[nums[i]]+=1;
       }

       for (int i : hashh) {
            if(i>1){
                System.out.println(true);
                break;
            }
       }

    }
}
