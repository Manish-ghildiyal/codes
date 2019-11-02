import java.util.Scanner;

public class CheckInverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size- ");
        int n=s.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        System.out.println("enter first array ");
        for (int i = 0; i <a.length ; i++) {
            a[i]=s.nextInt();
        }
        System.out.println("enter second array ");
        for (int i = 0; i <b.length ; i++) {
            b[i]=s.nextInt();
        }
        int f=check(a,b);
        if(f==1)
        System.out.println("yes");
        else
            System.out.println("no");
    }
    public static int check(int[]a,int[] b)
    {
        for (int i = 0; i <a.length ; i++) {
            int f=a[i];
            if(i==b[f]){}
            else
                return -1;
        }
    return 1;}

}
