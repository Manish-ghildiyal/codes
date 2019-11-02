import java.util.Scanner;

public class factorialRecursion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number ");
        int n=s.nextInt();
        System.out.println("factorial is "+fact(n));

    }
    public static int fact(int n)
    {
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
}
