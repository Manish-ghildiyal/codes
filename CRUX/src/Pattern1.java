import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter no. of rows-: ");
        int n=s.nextInt();
        System.out.println();
        int row=1;
        int col=1;;
        while(row<=n)
        {
            col=1;
            while(col<=row)
            {
                System.out.print("*");
                col++;
            }
            System.out.print("\n");
            row=row+1;

        }
    }
}
