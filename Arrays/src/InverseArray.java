import java.util.Arrays;
import java.util.Scanner;

public class InverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size");
        int n=s.nextInt();
        int[] ar=new int[n];
        System.out.println("enter array\n");
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        //System.out.println("Array before inverse is \t"+Arrays.toString(ar));
        inverse(ar);
    }
    public static void inverse(int[] ar)
    {
        int n=ar.length;
      int[] b=new int[n];
        for (int i = 0; i <n-1 ; i++) {
       int j=ar[i];
       b[j]=i;

        }
      System.out.println("array after  inverse is \t"+Arrays.toString(b));

    }
}
