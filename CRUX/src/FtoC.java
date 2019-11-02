import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        int f=0;
        int c=0;

       // System.out.println((5/9f*(float)(f-32)));

        for (int i = n1; i <=n2 ; i+=n3) {

            System.out.println(i+" "+ (int)(5/9f*(i - 32)));
        }
    }
}
