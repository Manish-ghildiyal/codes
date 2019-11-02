public class OptimizedQueue {
    private int ar[];
    private int DEFAULT_SIZE=1;
    int front=0,end=0;
    public OptimizedQueue()
    {
        this.ar=new int[DEFAULT_SIZE];
    }
    public boolean isFull()
    {
        return end==ar.length;}
    public boolean enqueue(int element)
    {
        if(isFull()) {
            System.out.println("full");
            return false;
        }
            ar[end++]=element;
        System.out.println("inserted "+element);
        return true;
    }
    public boolean isEmpty()
    {
        return end==0;
    }
    public int  dequeue()
    {
        if(isEmpty()) {
            System.out.println("empty");
            return 0;

        }        int temp=ar[0];


        front++;
        return temp;
    }
    public int front()
    {
        return ar[0];
    }
    public void dispay()
    {
        for (int i = front; i <end ; i++) {
            System.out.print(ar[i]+" ");
        }
    }
}

