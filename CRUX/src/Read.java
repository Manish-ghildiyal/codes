import java.io.DataInputStream;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {
        DataInputStream in = new DataInputStream(System.in);
        int n = 0;
        float f = 0.0f;
try{
            System.out.println("enter an integer ");
            n = Integer.parseInt(in.readLine());
            System.out.println("enter a float number ");
            f = Float.valueOf(in.readLine()).floatValue();}
         catch (Exception e) {
        }
        System.out.println("n= " + n);
        System.out.println("f= " + f);
    }
}
