import java.util.Scanner;

public class CountIntRec {
    public static void main(String[] args) {
        int[] a={1,2,2,3,3,3};
        Scanner s=new Scanner(System.in);
        System.out.println("enter no.");
        int n=s.nextInt();
        System.out.println("count is "+linear(a,n,0,0));
    }
    public static int linear(int[] a,int n,int count,int i)
    {
        // int i=0;
        if(i==a.length)
            return count;
        if(a[i]==n)
            count++;
        return linear(a,n,count,i+1);
    }
}
