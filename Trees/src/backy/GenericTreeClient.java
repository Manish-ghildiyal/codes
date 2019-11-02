package backy;

import java.util.Scanner;

public class GenericTreeClient {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        GenericTrees g=new GenericTrees();
        g.insert(s);
     //   g.display();
//        System.out.println(g.count());
//        System.out.println("max is "+g.max());
//        System.out.println("height is "+g.height());
//        System.out.println();
//        g.depthKelements(2);
      //  g.postorder();
     //   g.lo();
        g.depthKelements(2);
    }
}
