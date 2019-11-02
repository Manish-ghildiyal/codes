import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size-");
        int n=s.nextInt();
        int [] ar=new int[n];
        System.out.println("enter array\n");
        for (int i = 0; i <ar.length ; i++) {
            ar[i] = s.nextInt();
        }

        System.out.println("maximum is- "+max(ar));
    }
    public static int max(int[] ar)
    {
        int max=ar[0];
        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]>max)
            {
                max=ar[i];
            }
        }
        return max;
    }
}
