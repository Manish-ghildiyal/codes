import java.util.Scanner;

public class Converter {
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
            int rem=n%10;
            deci=deci+rem*place;
            n=n/10;
            place=place*base;
        }
        System.out.println("Decimal equivalent is "+deci);
    }
}
