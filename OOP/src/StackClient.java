import backy.Stack;
import javafx.animation.ScaleTransition;

import java.util.Arrays;
import java.util.Scanner;

public class StackClient {
    public static void main(String[] args) throws Exception {
        Stack s=new Stack();
        Scanner s1=new Scanner(System.in);
        int ch;
        while(true)
        {
        System.out.println("enter 1 for push 2 for pop and 3 for seeing top  ,4 for show array ,5 for exit");
        ch=s1.nextInt();
        switch (ch) {
            case 1:
                System.out.println("enter element to push");
                int n=s1.nextInt();
                try {
                    s.push(n);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                try {
                    System.out.println(s.pop());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 3:
                System.out.println(s.peak());
                break;
            case 4:
                System.out.println(Arrays.toString(s.show()));
                break;
            case 5:
                System.exit(0);
        }}
//        System.out.println(s.pop());
//            System.out.println(s.pop());
//            System.out.println(s.pop());
//            System.out.println(s.pop());
//
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }

    }
}
