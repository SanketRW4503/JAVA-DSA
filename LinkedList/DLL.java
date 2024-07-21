public class DLL {
    
    private Node head;
    private int size;
    private Node tail;

    public DLL(){

        size=0;
    }


    //this will insert the element at given index
    public void insertAt(int value, int index){
        if(head==null) return;
        if(index>size-1|| index<0) return;
        
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size-1){
            insertLast(value);
            return;
        }
        size++;

        Node temp= head;

        for(int i =0;i<index;i++){
            temp=temp.next;
        }


        Node node = new Node(value);

        node.next= temp;
        node.pre=temp.pre;
        temp.pre.next=node;
        temp.pre=node;

    }


    //this will insert the element at last
    public void insertLast(int value){
        size++;
        if(head==null){
            insertFirst(value);
            return;
        }

        Node node= new Node(value);

        node.pre=tail;
        tail.next=node;
        tail=node;
        

    }


    //this will return true if linkedlist is palindrome
    public boolean isPalindrome(){
        
        if(head==null || head.next==null) return true;
        
        Node start=head;
        Node end=tail;

        while (start!=end) {
                
            if(start.value!=end.value){
                return false;
            }

            start=start.next;
            end=end.pre;
            
        }

        return true;


    }


    //this will print the all nodes in reverse direction
    public void printRev(){
        if(tail==null) return;

        Node node = tail;

        while (node!=null) {
            System.out.print("<-"+node.value);
            node=node.pre;
        }
        System.out.println();
    }

    //this will insert the element at first 
    public void insertFirst(int value){



            Node node= new Node(value);
            size++;
            if(head==null){
                head=node;
                tail=node;
                return;
            }

            node.next=head;
            node.pre=null;
            head.pre=node;
            head=node;
    }

    //this will print all numbers present inside linkedlist
    public void display(){
        if(head==null) return;

        Node temp=head;


        while (temp!=null) {

            System.out.print(temp.value+"->");
            temp=temp.next;
        }

        System.out.println("END");
    }


    private class  Node {
        
        private int value;
        private Node next;
        private Node pre;

        public Node(int value){
            this.value=value;
        }

        public Node (int value, Node next, Node pre){
            this.value=value;
            this.next=next;
            this.pre=pre;
        }
    }
}
