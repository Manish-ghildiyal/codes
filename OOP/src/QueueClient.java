import backy.Stack;

public class QueueClient {
    public static void main(String[] args) {
        //OptimizedQueue q=new OptimizedQueue();
        CircularQueue q=new CircularQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
       // System.out.println(q.dequeue());
        System.out.println("deleted element "+q.dequeue());
        q.dispay();
    }
}
