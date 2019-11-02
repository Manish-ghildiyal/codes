import java.util.Scanner;

public class AnotherPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int row=1;
        int col=0;
        int space=0;
        while (row<=n){
            space=0;
            while (space<=n-row) {
                System.out.print("   ");
                space++;
            }
            int c=row-1;
            col=row*2-1;
            while (col>0){
                if(row<=col) {
                    c++;
                    System.out.print(c +"   ");
                }
                else
                {
                    c--;
                    System.out.print(c+"   ");
                }
                col--;
            }
            System.out.println();
            row++;
        }
    }
}
