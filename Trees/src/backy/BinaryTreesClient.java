package backy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryTreesClient {
    public static void main(String[] args) throws FileNotFoundException {
       File f=new File("inp");
        Scanner s=new Scanner(System.in);
        BinaryTrees b = new BinaryTrees();
        b.insert(s);
        b.insert(s);
        b.insert(s);
        b.insert(s);
        b.insert(s);
        b.disp();
        b.mirror();
        b.disp();
       // System.out.println( b.diameter());
    }
}
