import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        System.out.println(x+" raise to power "+n+" is "+powe(x,n));
    }
    public static int powe(int x,int n)
    {
        int place=1;
        int j=n;
        int k=x;
        while(n!=0)
        {
            x=x*place;

            n--;
            place=k;
        }
        return x;
    }
}
