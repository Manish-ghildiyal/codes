import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        int ar[]={1,2,2,3};
        Scanner s=new Scanner(System.in);
        System.out.println("enter no.");
        int n=s.nextInt();
        System.out.println("no. is found "+search(ar,n,0));
    }
    public static int search(int []ar,int n,int i)
    {
        if(ar.length==i)
            return -1;
        if(ar[i]==n)
            return i;
        return search(ar,n,i+1);
    }
}
