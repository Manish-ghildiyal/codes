import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Conversion c = new Conversion();
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int step = s.nextInt();
        c.farentocel(start,end,step);
    }
    public static void farentocel(int start,int end,int step)
    {

        while(start<=end)
        {
           int c=(int)((5f/9)*(start-32));
            start=start+step;
            System.out.println(c);
        }

    }
}
