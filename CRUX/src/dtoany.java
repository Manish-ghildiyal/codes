import java.util.Scanner;

public class dtoany {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int any=s.nextInt();
        int base=s.nextInt();
        btod(any,base);
    }
    public static void btod(int n,int base)
    {
        int place=1,deci=0;
        while(n>0)
        {
            int rem=n%2;
            deci=deci+rem*place;
            n=n/2;
            place=place*base;
        }
        System.out.println("Decimal equivalent is "+deci);
    }
}
