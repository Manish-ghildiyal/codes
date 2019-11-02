import java.util.Scanner;

public class ThreeSumTarget
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
                for (int k = j+1; k <a.length ; k++) {
                if(a[i]+a[j]+a[k]==t)
                {
                    System.out.println(a[i]+" "+a[j]+" "+a[k]);
                    /*
                    for (int p = j; p <k ; p++) {

                        a[p]=a[p+1];
                    }
                    for (int l = k; l <a.length-1 ; l++) {
                        a[k]=a[k+1]
                    }
                    */

                    f++;
                    break;
                    }
                }
            }
        }
    }
}
