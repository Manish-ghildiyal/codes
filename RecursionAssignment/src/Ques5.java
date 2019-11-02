import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter nth triangle ");
        int n=s.nextInt();
        System.out.println("value of nth triangle is "+triangle(n));
    }
    public static int triangle(int n)
    {
        if(n>0)
            return n+triangle(n-1);
        else
            return 0;
    }
}
