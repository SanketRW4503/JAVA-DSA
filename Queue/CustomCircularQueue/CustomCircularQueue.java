// package Queue.CustomCircularQueue;

public class CustomCircularQueue {

    private int[] data;

    private static int defaultSize = 10;

    int front;
    int end;

    int size;

    public CustomCircularQueue() {

        this(defaultSize);
    }

    public CustomCircularQueue(int size) {

        data = new int[size];
        front = 0;
        end = 0;
        this.size = 0;

    }

    // this will insert the element at last
    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;

        return true;
    }

    // this will remove the element from the start
    public boolean remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return false;
        }
        size--;
        if (front == data.length - 1) {
            front = 0;
            return true;
        }

        front++;
        return true;

    }

    public void display() {
        if (isEmpty()) {
            System.out.println(" queue is empty ");
            return;
        }

        int i =front;

       do {

            System.out.print(data[i]+"<-");
            i++;
            i=i%data.length;

        }while(i!=end);

        System.out.println("end");
    

    }

    // this will return true if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // this will return true if teh queue is full
    public boolean isFull() {
        return size == data.length;
    }

}
