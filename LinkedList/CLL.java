public class CLL {
    

    private Node head;
    private Node tail;

    private int size;


    public CLL(){
        size=0;
    }


    public void insertAt(int value, int index){
        if(head==null) return;
        if(index>size-1 || index<0) return ;
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size-1){
            insertLast(value);
            return;
        }
        size++;

        Node node= new Node(value);

        Node temp=head;

        for(int i =0;i<index-1;i++){
            temp=temp.next;
        }

        node.next=temp.next;
        temp.next=node;


    }

    public void insertFirst(int value){
        Node node = new Node(value);
        size++;
        if(head==null){
            head=node;
            tail=node;
            node.next=node;
            return;
        }

        node.next=head;
        head=node;
        tail.next=node;

    }


    public void insertLast(int value){
        Node node= new Node(value);

        size++;
        if(head==null){
            head=node;
            tail=node;
            node.next=node;
            return;
        }

        node.next=head;
        tail.next=node;
        tail=node;


    }

    public void display(){
        if(head==null) return;
        Node temp= head;
        do{
            System.out.print(temp.value+"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.print("End");
        System.out.println("");

    }

    private class Node{

       private int value;
        private Node next;

        public Node(int value){
                this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }

}
