package backy;

public class MergeSort {
    public Node head;
    private int size;
    private Node tail;

    public MergeSort() {
        this.size = 0;
    }
    public void insertfirst(String value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        head.name=value;
        size++;
        System.out.println("element inserted "+head.name);
        if(tail==null)
            tail=head;
    }
    public void insertlast(String value)
    {
        Node node=new Node(value);
        if(size==0)
        {
            insertfirst(value);
            return;
        }
        tail.next=node;
        tail=node;
        System.out.println("element inserted "+tail.name);
        size++;
    }
    public void display()
    {
        Node node=head;
        System.out.println("the list is");
        while(node!=null)
        {
            System.out.print(node.name+" -> ");
            node=node.next;
        }
        System.out.println("end");
    }
    public Node midElement()
    {
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next !=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public MergeSort mergeso(MergeSort first,MergeSort second)
    {
        Node f=first.head;
        Node s=second.head;
        MergeSort m=new MergeSort();
        while(f!=null && s!=null)
        {
            if(f.name.compareTo(s.name)>0)
            {
                m.insertlast(f.name);
                f=f.next;
            }
            else
            {
                m.insertlast(s.name);
                s=s.next;

            }
        }
        while(f!=null)
        {
            m.insertlast(f.name);
            f=f.next;

        }
        while(s!=null)
        {
            m.insertlast(s.name);
            s=s.next;
        }
        return m;
    }
    public MergeSort merge(MergeSort list)
    {
        if(list.size==1)
            return list;
        Node mid=midElement();
        MergeSort f=new MergeSort();
        f.head=list.head;
        f.tail=mid;
        f.size=(list.size+1)/2;
        MergeSort s=new MergeSort();
        s.head=mid.next;
        s.tail=list.tail;
        s.size=(list.size/2);
        mid.next=null;
        f=merge(f);
        s=merge(s);
        return mergeso(f,s);
    }


    public static class  Node{
       public   String name;
       private  Node next;

       public  Node(String name) {
           this.name = name;
       }
   }

}
