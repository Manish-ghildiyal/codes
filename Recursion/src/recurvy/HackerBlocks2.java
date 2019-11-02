package recurvy;

import java.util.Scanner;

public class HackerBlocks2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int row=1;
        int col=0;
        while(row<=n){
            col=row;
            while (col>0){
                if(col==row || col==1)
                    System.out.print(row);
                else System.out.print(0);
                col--;
            }
            System.out.println();
            row++;
        }
    }
}
