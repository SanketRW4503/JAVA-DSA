

//https://leetcode.com/problems/missing-number/description/


public class MissingNumberLeetcode {
    public static void main(String[] args) {
        int []arr={3,0,1};

        int sumofArray=0;
        int sumofNumbers=0;
        for(int i =0;i<=arr.length;i++){

            if(i<arr.length){
                sumofArray= sumofArray+arr[i];
            }

            sumofNumbers= sumofNumbers+i;

        }

      System.out.println(sumofNumbers-sumofArray);
    }
}
