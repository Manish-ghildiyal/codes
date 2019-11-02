public class DynamicCircularQueue extends CircularQueue{
    @Override
    public boolean enqueue(int element) {
        if(isFull())
        {
            int temp[]=new int[2*ar.length];
            for (int i = 0; i <ar.length ; i++) {
                temp[i]=ar[(front+i)%ar.length];
            }
            ar=temp;
            front=0;
            end=ar.length;
            System.out.println("mai badal gaya ");
        }
        return super.enqueue(element);
    }
}
