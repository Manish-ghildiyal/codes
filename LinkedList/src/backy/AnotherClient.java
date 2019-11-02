package backy;

public class AnotherClient  {
    public static void main(String[] args) {

        StackArrayList s=new StackArrayList();

        IntLL l = new IntLL();
        IntLL l1=new IntLL();
        l.insertlast(1);
        l.insertlast(2);
        l.insertlast(3);
        l.insertlast(4);
        l.insertlast(5);
        l.insertlast(6);
        l.display();
       // l.swap(2,1);
        //l.display();
//        l1=l;
//        l1.reverse();
//        l1.display();
     // System.out.println(IntLL.pallindrome(l));
       // l.pallindrome(l);
        //l.reverses(l);
      //  l.oddeven(l);
      //  l.reverseprint();
        l.append(2,l);
       l.display();
    }
}
