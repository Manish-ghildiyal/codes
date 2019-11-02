import java.util.Arrays;
import java.util.Scanner;

public class AddInArray {


        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("enter size-");
            int n=s.nextInt();
            int [] ar=new int[n];
            for (int i = 0; i <ar.length ; i++) {
                ar[i] = s.nextInt();
            }
            System.out.println("array before adding\n"+ Arrays.toString(ar));
           System.out.println("enter the value you want to add- ");
            //int a=s.nextInt();
            int b=s.nextInt();
            add(ar,b);

        }
        public static void add(int[] ar,int b)
        {
            for (int i = 0; i <ar.length ; i++) {
                ar[i]=ar[i]+b;
            }
            System.out.println("array after adding\n"+Arrays.toString(ar));
        }
    }


