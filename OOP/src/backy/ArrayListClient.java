package backy;

public class ArrayListClient {
    public static void main(String[] args) {


        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.dispplay();
//        System.out.println(a.remove());
//        System.out.println(a.remove());
//        System.out.println(a.remove());
//       // a.dispplay();
        a.set(2,5);
        a.dispplay();
    }
}
