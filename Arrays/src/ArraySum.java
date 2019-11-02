import java.util.Arrays;
import java.util.Scanner;

public class ArraySum
{
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
        sum(a,b);

    }
    public static void sum(int[] a,int[]b)
    {
        int c[]=new int[a.length+1];int n=0;
        int f=a.length-1;
        for (int i = a.length-1; i >=0 ; i--) {
            int sum=a[i]+b[i]+n;
            c[f+1]=sum%10;
            n=sum/10;
            f--;
        }c[0]=n;
        System.out.println("Sum is "+ Arrays.toString(c));
    }
}
