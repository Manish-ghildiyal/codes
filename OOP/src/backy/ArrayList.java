package backy;

import com.sun.javaws.IconUtil;

public class ArrayList {
     private int []ar;
    private int size=0;
    private int DEFAULT_SIZE=2;
    public ArrayList()
    {
         ar=new int[DEFAULT_SIZE];
    }
    public boolean isFull()
    {
        return  size==ar.length;
    }
    public void add(int element)
    {
        if(isFull()) {
        //            System.out.println("bhari hai be");
                    resize();
        }
        ar[size++]=element;
        System.out.println("element inserted "+element);
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int remove()
    {
        if(isEmpty()) {
            System.out.println("khali hai be");
            return 0;

        }int temp=ar[--size];
        return temp;
    }
    public void set(int index,int element)
    {
        ar[index]=element;
        System.out.println("element set");
    }
    public int get(int index)
    {
        return ar[index];
    }
    public void dispplay()
    {
        System.out.println("yh le bhai teri array ");
        for (int i = 0; i <size ; i++) {
            System.out.println(ar[i]+" ");
        }
    }
    private void resize(){
        int temp[]=new int[2*ar.length];
        for (int i = 0; i <ar.length ; i++) {
            temp[i]=ar[i];
        }
        ar=temp;
        System.out.println("mai badal gaya ");
    }


}
