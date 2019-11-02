import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort
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
            System.out.println("Array before sorting -"+Arrays.toString(a));
            sort(a);
            System.out.println("array after  sorting -" + Arrays.toString(a));
        }
        public static void sort(int[]a) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length-1- i; j++) {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        }
}
