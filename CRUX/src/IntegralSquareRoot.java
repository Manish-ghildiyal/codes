import java.util.Scanner;

public class IntegralSquareRoot
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Integral square root of number is- "+square(n));
    }
    public static int square(int n)
    {
        if(n==0 || n==1)
            return n;
        int i=1;
        int result=1;
        while(result<=n)
        {
            i++;
            result=i*i;
        }
        return i-1;
    }
}
