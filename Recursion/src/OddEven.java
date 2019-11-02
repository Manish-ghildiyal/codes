import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number ");
        int n=s.nextInt();
        odEv(n);
    }
    public static void odEv(int n)
    {
        if(n>0)
        {
            if(n%2!=0)
                System.out.println(n);
            odEv(n-1);
            if (n%2==0)
                System.out.println(n);
        }
        //if(n==0)
          //  return;
    }
}
