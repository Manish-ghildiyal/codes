package backy;

public class LLclient {
    public static void main(String[] args) {
        //SingleLL list=new SingleLL();
        MergeSort list=new MergeSort();
        MergeSort list2=new MergeSort();
        list.insertlast("1");
        list.insertlast("2");
        list.insertlast("4");
        list.insertlast("3");
        list2.insertlast("3");
        list2.insertlast("5");
        list2.insertlast("6");
        list2.insertlast("7");
        list.display();
        list2.display();
        MergeSort l3=list.merge(list);
        l3.display();
//        list.deletelast();
//        list.display();
//        list.deletefirst();
//        list.display();
//        list.deletefirst();
//        list.display();
//        list.insertmid(2,"4");
//        list.display();
//        list.deletemid(2);
//        list.deletemid(1);
//        list.display();
        //list.deletemid(2);
        //list.display();
//        SingleLL.Node n=new SingleLL.Node("man");
//        n= list.find("2");
//        System.out.println(n.name);
        //list.reverse();
        //list.display();
    //    list.duplicate();
   //    list.duplo();
      //  list.ithFromLast(2);
        //list.display();
        //System.out.println("mid element is "+list.midElement());
    }
}
