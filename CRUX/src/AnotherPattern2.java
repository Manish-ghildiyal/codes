import java.util.Scanner;

public class AnotherPattern2 {
    public static void main(String[] args) {
       // Scanner s=new Scanner(System.in);
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int row=1;
        int col=0;
        while (row<=n){
            int ss=1;
            while (row>=ss) {
                System.out.print(ss+" ");
                ss++;
            }
            ss--;
            int space=(n-row)*2-1,c=space/2+1;
            while (space>0) {
                System.out.print("  ");

                if(space>=c)
                    ss++;
                else ss--;
                space--;
            }
            ss=ss-1;
            while (ss>0){
                               System.out.print(ss+" ");
                ss--;
            }
            System.out.println();
            row++;
        }
    }
}
