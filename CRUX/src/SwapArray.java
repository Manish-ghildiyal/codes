import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size-");
        int n=s.nextInt();
        int [] ar=new int[n];
        for (int i = 0; i <5 ; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println("array before swap\n"+ Arrays.toString(ar));
        System.out.println("enter the indexes you want to swap- ");
        int a=s.nextInt();
        int b=s.nextInt();
        swap(ar,a,b);

        }
        public static void swap(int[] ar,int a,int b)
        {
            int temp=ar[a];
            ar[a]=ar[b];
            ar[b]=temp;
            System.out.println("array after swap\n"+Arrays.toString(ar));
    }
}
