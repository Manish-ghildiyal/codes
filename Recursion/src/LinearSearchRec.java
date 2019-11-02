import java.util.Scanner;

public class LinearSearchRec {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size" );
        int n=s.nextInt();
        System.out.println("enter array ");
        int []a=new int[n];
        for (int i = 0; i <a.length ; i++) {
            a[i]=s.nextInt();
        }
        int i=0;
        System.out.println("enter no. u want to search");
        int b=s.nextInt();
        System.out.println("no. is found "+linear(a,b,i));
    }
    public static boolean linear(int[] a,int b,int i)
    {
       // int i=0;
        if(i==a.length)
            return false;
        if(a[i]==b)
            return true;
        return linear(a,b,i+1);
    }
}
