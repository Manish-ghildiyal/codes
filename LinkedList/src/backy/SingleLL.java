package backy;

public class SingleLL {
    private Node head;
    private int size;
    private Node tail;

    public SingleLL() {
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
    public void deletefirst()
    {
        if(head==null)
            return;
        size--;
        System.out.println(head.name+" is deleted");
        head=head.next;
    }
    public void deletelast()
    {
        Node temp=head;
        if(head==null)
            return;
        System.out.println(tail.name+" is deleted");
        while(true)
        {
            if(temp.next==tail)
            {
                temp.next=null;
                tail=temp;
                break;
        }
            size--;
            temp=temp.next;
    }
    }
    public Node get(int index)
    {
        Node temp=head;
        for (int i = 0; i <index ; i++) {
            temp=temp.next;
        }
        //System.out.println(temp.name);
        return temp;
    }
    public void insertmid(int index,String element)
    {
        if(head==null)
        {
            insertfirst(element);
            return;
        }
        if(index==0)
        {
            deletefirst();
            return;
        }
        if(index==size)
        {
            insertlast(element);
            return;
        }
        Node temp=get(index-1);
        Node node=new Node(element);
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    public void deletemid(int index)
    {
        if(head==null)
        {
            System.out.println("khali hai be");
            return;
        }
        if(index==0)
        {
            deletefirst();
            return;
        }
        if(index==size-1)
        {
            deletelast();
            return;
        }
        Node temp=get(index-1);
        temp.next=temp.next.next;
        size--;
    }
    public Node find(String s)
    {
        Node temp=head;
        while(temp.next!=null){
            if(s.equals(temp.name))
                return  temp;
            temp=temp.next;
        }
        return null;
    }
    public void reverse()
    {
        reverse(head);
    }
    public void reverse(Node node)
    {
        if(node==tail)
        {
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    public void duplicate()
    {
        duplicate(head,size);
    }
    public void duplicate(Node node,int size)
    {
        if(node.next==tail.next)
            return;
        if(node.name.equals(node.next.name))
        {
            node.next=node.next.next;
            size--;
        }
        duplicate(node.next,size);
    }
    public void duplo()
    {
        Node temp=head;
        while ( temp.next!=null) {
            if (temp.name.equals(temp.next.name))
            {
                temp.next=temp.next.next;
                size--;
            }
            else
                temp=temp.next;
        }
        //tail.next=null;
        tail=temp;
    }
    public void ithFromLast(int k)
    {
        Node temp1=head,temp2=head;
        for (int i = 0; i <=k ; i++) {
            temp1= temp1.next;
        }
        while(temp1!=null)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        System.out.println("ith element is "+temp2.name);

    }
    public String  midElement()
    {
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next !=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.name;
    }

    public static class  Node{
       public   String name;
       private  Node next;

       public  Node(String name) {
           this.name = name;
       }
   }

}
