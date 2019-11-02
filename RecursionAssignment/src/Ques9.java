import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        int ar[]={1,2,2,3,3,3};
        Scanner s=new Scanner(System.in);
        System.out.println("enter no.");
        int n=s.nextInt();
        System.out.println("no. is found "+search(ar,n,ar.length-1));
    }
    public static int search(int []ar,int n,int i)
    {
        if(i==-1)
            return -1;
        if(ar[i]==n)
            return i;
        return search(ar,n,i-1);
    }
}
