import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=s.nextInt();
        System.out.println("count is- "+county(n,i));
    }
    public static int county(int n,int i)
    {
        int rem=0,c=0;
        if(n==0)
            return 1;
        else {
            while (n != 0) {
                rem = n % 10;
                if (rem == i) {
                    c++;
                }
                n = n / 10;
            }
            return c;
        }
    }
}
