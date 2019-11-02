import java.util.Scanner;

public class NthFiboRecursion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //System.out.println("enter nth number ");
       // int n=s.nextInt();
        System.out.println("nth fibonacci is "+fibo(4));
    }
    public static int fibo(int n)
    {
        if(n<2)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
}
