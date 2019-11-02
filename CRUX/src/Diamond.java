import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter number-");
        int n=s.nextInt();
        //n=n/2+1;
        System.out.println();
        int row=1;
        int k=1;
        while(k<=2*n-1)
        {
            int space=1,col=1;
            while(space<=n-row)
            {
                System.out.print(" ");
                space++;
            }
            while(col<=2*row-1)
            {
                System.out.print("*");
                col++;
                }

            if(k<n) {
                row = row + 1;
            }
            else {

                row = row - 1;
            }
            System.out.println();
            k++;
        }
    }
}
