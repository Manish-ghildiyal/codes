package backy;

public class IntLL {
    private Node head;
    private int size;
    private Node tail;
    public IntLL() {
        this.size = 0;
    }
    public void insertfirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        head.value=value;
        size++;
        //System.out.println("element inserted "+head.value);
        if(tail==null)
            tail=head;
    }
    public void insertlast(int value)
    {
        Node node=new Node(value);
        if(size==0)
        {
            insertfirst(value);
            return;
        }
        tail.next=node;
        tail=node;
        //System.out.println("element inserted "+tail.value);
        size++;
    }
    public void deletelast()
    {
        Node temp=head;
        if(head==null)
            return;
       // System.out.println(tail.value+" is deleted");
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
    public void display()
    {
        Node node=head;
        System.out.println("the list is");
        while(node!=null)
        {
            System.out.print(node.value+" -> ");
            node=node.next;
        }
        System.out.println("end");
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
    public void swap(int a ,int b)
    {
        Node temp1=head,temp2=head,temp=head;
        while (temp!=null)
        {
            if(temp1.value==a)
                break;
            temp=temp.next;
            temp1=temp1.next;
        }
        temp=head;
        while(temp!=null)
        {
            if (temp2.value==b)
                break;
            temp=temp.next;
            temp2=temp2.next;
        }
        temp1.value=b;
        temp2.value=a;
    }
    public static  boolean pallindrome(IntLL l)
    {
        IntLL l1=new IntLL();
        Node temp=l.head;
        while(temp!=null)
        {
            l1.insertlast(temp.value);
            temp=temp.next;
        }
        l1.reverse();

        temp=l.head;
        Node temp2=l1.head;

        while (temp!=null )
        {
            if(temp.value!=temp2.value)
                return false;
          temp=temp.next;
          temp2=temp2.next;
        }
    return true;
    }
    public void reverses(IntLL l) {
        StackArrayList s=new StackArrayList();
        Node temp=l.head;
        while(temp!=null)
        {
            s.push(temp.value);
            temp=temp.next;
        }
        temp=l.head;
        while(temp!=null)
        {
            temp.value=s.pop();
            temp=temp.next;
            //s.top--;
        }
        //l.display();

    }
    public void oddeven(IntLL l)
    {
        StackArrayList s=new StackArrayList();
        Node temp=l.head;
        Node prev=l.head;
        temp=temp.next;
        while(temp.next!=null)
        {
            if(temp.value%2==0)
            {
                s.push(temp.value);
                prev.next=temp.next;
                temp=prev;
                //l.insertlast(s.pop());
            }
            else {
                prev = prev.next;

            }
           // l.insertlast(s.pop());
            temp=temp.next;
        }
        while(s.top>=0)
        {
            l.insertlast(s.pop());
        }

        l.display();

    }
    public void reverseprint()
    {
        reversei(head);
    }
    public void reversei(Node node)
    {
        if(node==null)
        {
            //head=tail;
            return;
        }
        reversei(node.next);
        System.out.print(node.value+" -> ");
    }
    public void append(int k,IntLL l)
    {

        Queue q=new Queue();
        Node temp1=head,temp2=head;
        for (int i = 0; i <=k ; i++) {
            temp1= temp1.next;
        }
        while(temp1!=null)
        {
            temp1=temp1.next;
            temp2=temp2.next;

        }
        //System.out.println("ith element is "+temp2.value);
        temp1=temp2;
        temp2=temp2.next;
        while (temp2!=null)
        {
            q.enqueue(temp2.value);
            temp2=temp2.next;
        }
        temp1.next=null;
        for (int i = q.end-1; i >=0 ; i--) {
            l.insertfirst(q.ar[i]);
        }

    }
    public void deletefirst()
    {
        if(head==null)
            return;
        size--;
        //System.out.println(head.name+" is deleted");
        head=head.next;
    }
    public void kthreverse(int i,IntLL l){
        StackArrayList s=new StackArrayList();
        int j=i;
        Node temp=l.head;
        while(temp!=null)
        {
            while(j>0 && temp.next!=null){
                s.push(temp.value);
                l.deletefirst();
                j--;
            }

        }
    }
    public static class  Node{
        public   int value;
        private  Node next;

        public  Node(int value) {
            this.value =value;
        }
    }
}
