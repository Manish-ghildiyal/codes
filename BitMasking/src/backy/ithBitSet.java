package backy;

public class ithBitSet {
    public static void main(String[] args) {
        set(2,9);
        setbit(9,2);
    }
    public static void set(int ith,int target)
    {
        int n=0;
        int i=0;
       while(true) {
           if (i == ith) {
               n = n | 1;
               break;
           }
           n = n >> 1;
           i++;
       }
           target = target | n;
           System.out.println(target);
       }

       public static void setbit(int n,int i){
        int mask=1<<i;
        n=n | mask;
           System.out.println(n);
       }
       public static void offbit(int n,int i)
       {
           int mask=~(1<<i);
           n=n & mask;
       }
    }


