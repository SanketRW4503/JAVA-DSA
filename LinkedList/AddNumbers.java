public class AddNumbers {
    static Node head;
    static Node tail;

    public static void insertLast(int value){
        Node node= new Node(value);
        if(head==null){
            head=node;
        }
        if(tail!=null){
        tail.next=node;
        }
        tail=node;
    }

        //it displays all elements
    public static void display(){
        Node temp=head;
        if(temp==null) return;
        while (temp!=null) {
            
            System.out.print(temp.val+"->");

            temp=temp.next;
        }
        System.out.println("END");
    }
    
        public static void displayList(Node head){
        Node temp=head;
        if(temp==null) return;
        while (temp!=null) {
            
            System.out.print(temp.val+"->");

            temp=temp.next;
        }
        System.out.println("END");
    }
    public static class Node{
        private int val;
        private Node next;
        
        
       public Node(int value){
            this.val=value;
        }
    }

    public static void main(String[] args) {

        insertLast(3);
        insertLast(4);
                insertLast(5);

        display();

        int firstNumber= getNumber();
        int secondNumber= 45;

        long sum=firstNumber+secondNumber;
    
        Node newNodeHead=null;
        Node preNode=null;
        while (sum!=0) {

            int lastDigit= (int)(sum%10);

            Node newNode= new Node(lastDigit);

            if(newNodeHead==null){
                newNodeHead=newNode;
                newNode.next=null;
            }else{
                newNodeHead=newNode;
                newNode.next=preNode;
            }
            preNode=newNode;
            sum=sum/10; 
        
        }

        displayList(newNodeHead);
    }


    public static int getNumber(){
        Node node=head;
        int number=0;
        while(node!=null){
            number=(number*10)+node.val;
            node=node.next;
        }

        return number;

    }
}
