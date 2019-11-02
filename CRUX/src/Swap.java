import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        swappy(a,b);
    }
    public static void swappy(int a,int b){
        System.out.println("a and b before swapping is "+a+" "+b);
        int t=a;
        a=b;
        b=t;
        System.out.println("a and b after  swapping is "+a+" "+b);
    }
}
