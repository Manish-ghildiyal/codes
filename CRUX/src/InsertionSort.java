import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("enter size-");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("enter array");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        insert(a);
        System.out.println("Array after sorting is"+ Arrays.toString(a));

    }
    public static void insert(int[] a)
    {
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(a[j]<a[j-1])
                {
                    SelectionSort2.swap(a,a[j],a[i]);
                }
            }

        }
    }
}