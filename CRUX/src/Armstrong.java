import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("no is armstrong- "+ army(n));
    }
    public static boolean army(int n)
    {
        int c=0;
        int arm=0;
        int j=n;
        int rem=0;
        int k=0;
        int p=n;
        while(j!=0)
        {
            c++;
            j=j/10;
        }
        c=c-1;
        while(n!=0)
        {
            k=c;
            rem=n%10;
            int y=rem;
            while(k!=0)
            {
                rem=rem*y;
                k--;
            }
            arm=arm+rem;
            n=n/10;
        }
        if(arm==p)
        return true;
        else
            return false;
    }
}
