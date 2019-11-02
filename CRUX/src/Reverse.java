import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rem=0;
        int rev=0;
        System.out.println();
        while(n>0)
        {
            rem=n%10;
            n=n/10;
            rev=rev*10+rem;
            System.out.print(rem);

        }
       // System.out.println("reverse is "+rev);
    }
}
