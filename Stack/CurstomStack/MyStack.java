public class MyStack {

    int [] data;

    private int top=-1;

    //default size of stack
    protected final static int defaultSize=10;


    //if user does't provide value then this will create the default size stack 
    public MyStack(){
        this(defaultSize);
    }

    //constructor which takes size for stack
    public MyStack(int size){
        data=new int [size];
    }


    //this will push the element inside stack
    public boolean push(int num){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }

        top++;
        data[top]=num;
        return true;
    }

    //this will remove the lastly added element inside stack
    public boolean pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return false;
        }

        data[top]=0;
        top--;
        return true;

    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }

        return data[top];
    }


    //this will return true if stack is empty
    public boolean isEmpty(){
        return top==-1;
    }

    //this will return true if stack is full
    public boolean isFull(){
        return top==data.length-1;
    }




    

}

