import java.util.Scanner;
//import java.lang.math.pow;

public class MirrorInverse
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int place=1;
        int rev=0;
        while(n!=0)
        {
            int value=n%10;
            rev=rev+place*(int)(Math.pow(10,value-1));
            n=n/10;
            place++;
        }
        System.out.println("the mirror inverse is- "+rev);
    }
}
