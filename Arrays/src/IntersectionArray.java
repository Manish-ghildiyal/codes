import java.util.Arrays;
import java.util.Scanner;

public class IntersectionArray {
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
        intersect(a,b);
        //System.out.println("intersection is "+ Arrays.toString(f));
    }
    public static void intersect(int[] a,int[] b)
    {
        int[] c=new int[a.length];
        int f=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <b.length ; j++) {
                if(a[i]==b[j])
                {
                    c[f]=a[i];
                    //System.out.println(a[i]+" "+b[i]);
                    for(int k=j;k<b.length-1;k++)
                    {
                        b[k]=b[k+1];
                    }

                    f++;
                    break;
                }
            }
        }
       // System.out.println("intersected values are- "+Arrays.toString(c));
        for (int i = 0; i <f ; i++) {
            System.out.println(c[i]);
        }
    }
}
