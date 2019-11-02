import java.util.Scanner;

public class TwoSumTarget 
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array");
        for (int i = 0; i <a.length ; i++) {
                       a[i]=s.nextInt();
        }
        System.out.println("enter target");
        int t=s.nextInt();
        target(a,t);

    }
    public static void target(int[] a,int t)
    {
        int f=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]+a[j]==t)
                {
                    System.out.println(a[i]+" "+a[j]);
                    for (int k = j; k <a.length-1 ; k++) {
                        a[k]=a[k+1];
                    }
                    f++;
                    break;
                }
            }
        }
    }
}