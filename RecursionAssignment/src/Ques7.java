import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        int ar[]={1,2,3};
        Scanner s=new Scanner(System.in);
        System.out.println("enter no.");
        int n=s.nextInt();
        System.out.println("no. is found "+search(ar,n,0));
    }
    public static boolean search(int []ar,int n,int i)
    {
        if(ar.length==i)
            return false;
        if(ar[i]==n)
            return true;
        return search(ar,n,i+1);
    }
}
