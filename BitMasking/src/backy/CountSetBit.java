package backy;

public class CountSetBit {
    public static void main(String[] args) {
        bitchange(11,14);
    }
    public static void bitchange(int i,int j)
    {
        int n=i^j;
        int count=0;
        while(n!=0)
        {
            if((n & 1)==1)
                count++;
            n=n>>1;
        }
        System.out.println("bit change required is "+count);
    }
}
