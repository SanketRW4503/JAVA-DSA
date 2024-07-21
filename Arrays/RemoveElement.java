//https://leetcode.com/problems/remove-element/submissions/1309161878/?envType=study-plan-v2&envId=top-interview-150
public class RemoveElement {
    public static void main(String[] args) {
        int [] arr={3,2,2,3};


    int k=3;

        int count=0;

    for(int i=0;i<arr.length;i++){

        if(arr[i]==k){
            //find next non k number
            int index=-1;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]!=k){
                    count++;
                    index=j;
                    break;
                }
            }

            if(index!=-1){
                int temp= arr[index];
                arr[index]=arr[i];
                arr[i]=temp;

            }

        }else{
            count++;
        }

    }
}
}
