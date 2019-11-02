import java.util.ArrayList;
import java.util.Scanner;

public interface ArrayL {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList ar=new ArrayList();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.set(0,5);
        ar.add(s.nextInt());
        System.out.println(ar.indexOf(2));
        System.out.println(ar);
    }
}
