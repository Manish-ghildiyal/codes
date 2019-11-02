package backy;

public class StackArrayList {
    public int[] ar;
    public int DEFAULT_SIZE=3;
    public int top;
    public StackArrayList()
    {
        this.ar=new int[DEFAULT_SIZE];
        top=-1;
    }
    public boolean isFull(){
        return top==ar.length-1;
    }
    public boolean push(int element) throws  Exception
    {
        if(isFull()){
            //return false;
            throw new Exception("bhar gayi hai be");
        }
        ar[++top]=element;
        return true;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int  pop() throws Exception
    {
        if(isEmpty()){
            //System.out.println("Stack is empty");
            throw new Exception("khali hai be");

        }
        //System.out.println("element popped is "+ar[top]);

        return ar[top--];
    }
    public int peak()
    {
        return ar[top];
    }
    public int[] show(){
        return ar;
    }

}
