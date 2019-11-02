import java.sql.SQLOutput;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two nos. first one should be less than or equal to second- ");
        int n1=s.nextInt();
        int n2=s.nextInt();
        System.out.println("The GCD is- "+gcd(n1,n2));
    }
    public static int gcd(int n1,int n2)
    {
        int n=n1;
        while(n>0)
        {
            if(n2%n==0 && n1%n==0)
            {
                return n;
            }
            n--;
        }

    return 0;}
}
