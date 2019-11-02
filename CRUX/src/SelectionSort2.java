import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort2 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("enter size-");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("enter array");
        for (int i = 0; i <a.length ; i++) {
            a[i]=s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            int max=max(a,0,a.length-i-1);
            swap(a,max,a.length-i-1);
        }
            System.out.println("Array after sorting is- "+Arrays.toString(a));

    }
    public static int max(int[] a,int b,int c)
    {
        int max=0;
        for (int i = b; i <=c ; i++) {
            if(a[max]<a[i])
                max=i;
        }
        return max;
    }
    public static void swap(int[] a,int first,int second)
    {
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }
}
