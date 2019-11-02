import java.util.Scanner;

public class SetBetweenTwoNos {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        for (int i = 0; i <n ; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            for (int j= a; j <= b; j++) {
                int c=j;
                while (c != 0) {
                    if ((c & 1) == 1)
                        count++;
                    c = c>> 1;
                }
            }
        }
        System.out.println("active bits are "+count);
    }
}
