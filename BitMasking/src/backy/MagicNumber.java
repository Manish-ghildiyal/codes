package backy;

public class MagicNumber {
    public static void main(String[] args) {
        magic(3);
    }
    public static void magic(int n)
    {
        int pow=1;
        int r=0;
        while (n!=0)
        {
             pow=pow*5;
             if((n&1)==1)
                 r=r+pow;
             n=n>>1;
        }
        System.out.println(r);
    }
}
