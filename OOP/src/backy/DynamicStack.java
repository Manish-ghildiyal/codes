package backy;

public class DynamicStack extends StackArrayList {

    @Override
    public boolean push(int element) throws Exception {
        if(this.isFull())
        {
            int temp[]=new int[2*ar.length];
            for (int i = 0; i <ar.length ; i++) {
                temp[i]=ar[i];
            }
            ar=temp;
            System.out.println("mai badal gaya ");
        }
        return super.push(element);
    }
}
