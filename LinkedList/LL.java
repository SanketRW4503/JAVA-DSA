public class LL {
    Node head;
    private int size;
    private Node tail;
    public LL(){
        size=0;
    }


    //insert element at first
    public void insertFirst(int value){
        Node node= new Node(value);
        if(head!=null){
            node.next=head;
        }else{
            tail=node;
        }
    
        head=node;
        size++;
    }

    //insert element at last 
    public void insertLast(int value){
        Node node= new Node(value);
        if(tail!=null){
        tail.next=node;
        }
        tail=node;
        size++;
    }


    //insert element at given index
    public void insertAt(int value, int index){
        if(index==0){
            insertFirst(value);
            return;
        }

        if(index==size-1){
            insertLast(value);
            return;
        }
        Node temp =head;
        for(int i =0;i<index-1;i++){

            temp=temp.next;
        }
        Node node= new Node(value, temp.next);
        temp.next=node;
    }


    //it displays all elements
    public void display(){
        Node temp=head;
        if(temp==null) return;
        while (temp!=null) {
            
            System.out.print(temp.value+"->");

            temp=temp.next;
        }
        System.out.println("END");
    }


    //returns true if element is present otherwise false
    public boolean contains(int value){
        Node temp= head;
        if(temp==null) return false;
        
        while(temp!=null){

            if(temp.value==value){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

   //this will delete the first element inside the list 
    public void deleteFirst(){
        Node  temp= head;
        size--;
        if(temp.next==null){
            head=null;

            return;
        }else{
            head=temp.next;
        }

    }

    //this will sort the linkedlist  
    public void bubbleSort(){
        if(size<=1) return ;
        for(int i =size-1;i>=0;i--){
            Node node=head;
            for(int j =0;j<i;j++){
                if(node.value>node.next.value ){
                    int temp = node.value;
                    node.value=node.next.value;
                    node.next.value=temp;
                }
                node=node.next;
            }

        }


    }


    //this will delete the element at given index 
    public void deleteAt(int index){
        if(head==null) return;
        size--;
        if(index==0) {
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;
        }

        Node temp= head;

        for(int i =0;i<index-1;i++){
            temp=temp.next;
        }

        temp.next=temp.next.next;
    

    }

    //this will delete the last element 
    public void deleteLast(){
        Node temp = head;
        if(temp==null) return;
        if(temp.next==null){
            head=null;
            tail=null;       
             size--;

            return;
        }
        size--;

        int lastValue=tail.value;

        while (temp!=null) {
            if(temp.next.value==lastValue){
                temp.next=null;
                tail=temp;
            }

            temp=temp.next;
        }
    }                                     

    public class Node{

        private int value;
        private Node next;


        public Node(int value){
                this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
