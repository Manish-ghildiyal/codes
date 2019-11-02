import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        int row = 0, a = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter no of lines ");
        int n = s.nextInt();
        pascal(n,0,0);
    }
    public static void pascal(int n,int row,int col){
        /*while (row<n)
        {
           int i=0;
           int a = fact(row);
            while(i<=row)
            {
                int b=fact(i);
                int c=fact(row-i);
                System.out.print(a/(b*c)+" ");
                i++;
            }
            System.out.println();
            row++;
        }
        if(n==row)
            return;
        int a=fact(row);
        for (int i = 0; i <row ; i++) {
            int b=fact(i);
            int
        }*/
    }
    public static int fact(int n)
    {
        int f=1;
        if(n==0 || n==1)
            return 1;
        else
        {
            for (int i = 1; i <=n ; i++) {
                f=f*i;
            }

        }
        return f;
    }
}
