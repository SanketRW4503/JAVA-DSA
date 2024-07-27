public class CustomQueue {


    private int data[];

    static int defaultSize=10;

    private int end;

    public CustomQueue(){
        this(defaultSize);
    }
    

    public CustomQueue(int size){
        data= new int[size];
        end=-1;
    }

    //this will insert the element in the queue at end position
    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full ");
            return false;
        }
        end++;
        data[end]=item;
        return true;
    }   

    //this will remove the first element from the queue
    public boolean remove(){
            if(isEmpty()){
                System.out.println("Queue is empty !");
                return false;
            }
            if(end==0){
                end--;
                return true;
            }

            for(int i =1;i<=end;i++){

                data[i-1]=data[i];
            }
            end--;
            return true;
            
    }

    public void display(){
        if(isEmpty()){
            System.err.println("Queue is Empty ");
            return;
        }

        for(int i=0;i<=end;i++){
            System.out.print(data[i]+"<-");
        }
        System.out.println("END");
    }

    //this will return true is the queue is full
    public boolean isFull(){
        return end==data.length-1;
    }

    //this will return true if the queue is empty
    public boolean isEmpty(){
        return end==-1;
    }
}