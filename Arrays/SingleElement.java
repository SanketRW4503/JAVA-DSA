public class SingleElement {
    
    public static void main(String[] args) {
        
        int [] arr={1 ,1 ,3 ,3, 6 ,9 ,9 ,10 ,10 };

        int sumArray=0;
        int actualSum=0;

        int s=-1;
        for(int i =0;i<arr.length;i++){
            
            sumArray=sumArray+arr[i];
            
            if(s!=arr[i]){
                s=arr[i];
                actualSum=actualSum+s+s;

            }

           
        }

       

        System.out.println(actualSum-sumArray);
    }
}
