// package Queue.CustomCircularQueue;
// import Queue.CustomCircularQueue.CustomCircularQueue;

class CCmain {
    public static void main(String[] args) {

        CustomCircularQueue queue = new CustomCircularQueue(5);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

     

      
        queue.display();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();

        queue.display();


    }
}
