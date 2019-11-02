import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size-");
        int n=s.nextInt();
        int [] ar=new int[n];
        System.out.println("enter array");
        for (int i = 0; i <ar.length ; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println("Enter number you want to search");
        int a=s.nextInt();
        int b=search(ar,a);
        if(b==-1)
            System.out.println("number is not found");
        else
            System.out.println("number is found and index is- "+b);
    }
    public static int search(int[] ar,int a)
    {
        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]==a)
                return i;
        }
        return -1;
    }
}
