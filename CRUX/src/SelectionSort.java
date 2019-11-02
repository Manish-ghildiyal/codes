import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size-");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("enter array");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Array before sorting -"+ Arrays.toString(a));
        sort(a);
        System.out.println("array after  sorting -" + Arrays.toString(a));
    }
    public static void sort(int[] ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            for (int j = 0; j <ar.length ; j++) {
                if (ar[i]<ar[j])
                {
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
    }
}
