public class Queue {
    private int ar[];
    private int DEFAULT_SIZE=10;
    int front=0,end=0;
    public Queue()
    {
        this.ar=new int[DEFAULT_SIZE];
    }
    public boolean isFull()
    {
        return end==ar.length;}
    public boolean enqueue(int element)
    {
        if(isFull())
            return false;
        ar[end++]=element;
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

        for (int i = 1; i <end ; i++) {
            ar[i-1]=ar[i];
        }
        end--;
        return temp;
    }
    public int front()
    {
        return ar[0];
    }
    public void dispay()
    {
        for (int i = 0; i <end ; i++) {
            System.out.print(ar[i]+" ");
        }
    }
}

