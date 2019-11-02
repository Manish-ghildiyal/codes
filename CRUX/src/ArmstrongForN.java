import java.util.Scanner;

public class ArmstrongForN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        army(  n1, n2);
    }

    public static void  army(int n1, int n2) {
        while (n1 <= n2) {
            int j=n1;
            int rem = 0;
            int p = n1;
            int c=0;
            int k=n1;
            int l=n1;
            int arm = 0;
            while (j != 0) {
                c++;
                j = j / 10;
            }
            c = c - 1;
            while (l != 0) {
                k = c;
                rem = l % 10;
                int y = rem;
                while (k != 0) {
                    rem = rem * y;
                    k--;
                }
                arm = arm + rem;
                l= l / 10;
            }

            if(arm==n1)
                System.out.println(n1+" is armstrong");
            n1++;
        }
    }
}