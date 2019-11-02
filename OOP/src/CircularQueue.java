public class CircularQueue {
    public int ar[];
    private int DEFAULT_SIZE=1;
    public int front=0,end=0;
    public int size=0;
    public CircularQueue()
    {
        this.ar=new int[DEFAULT_SIZE];
    }
    public boolean isFull()
    {
        return size==ar.length;}
    public boolean enqueue(int element)
    {
        if(isFull()) {
            System.out.println("full");
            return false;
        }
            ar[end++]=element;
        end=end % ar.length;
        size++;
        System.out.println("inserted "+element);
        return true;
    }
    public boolean isEmpty()
    {
        return end==front;
    }
    public int  dequeue()
    {
        if(isEmpty()) {
            System.out.println("empty");
            return 0;

        }        int temp=ar[front++];


        front=front%ar.length;
        size--;
        return temp;
    }
    public int front()
    {
        return ar[0];
    }
    public void dispay()
    {
        for (int i = 0; i <size ; i++) {
            System.out.print(ar[(front+i)%ar.length]+" ");
        }
    }
}

