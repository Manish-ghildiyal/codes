import java.util.Scanner;

public class NthSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        serie(n1,n2);

    }
    public static void serie(int n1,int n2)
    {
        int count=1;
        while(count<=n1)
        {
            int a=3*count+2;
            if(a%n2!=0) {
                System.out.println(count + " th is " + a);
                //count++;
            }
            else {
                //count++;
                n1++;
            }
            count++;
        }
    }
}
