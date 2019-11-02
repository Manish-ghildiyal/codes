import javax.security.sasl.SaslClient;
import java.util.Scanner;
import java.util.*;

import static java.lang.StrictMath.sqrt;

public class HackerBlock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ar[]=new int[n];
        for (int i = 0; i <n ; i++) {
            ar[i]=s.nextInt();
        }
        int m=s.nextInt();
        System.out.println(lastindex(ar,m,0,-1));
    }
    public static int lastindex(int []ar,int m,int i,int c){
        if(i==ar.length)
            return c;
        if(ar[i]==m)
            c=i;
        return lastindex(ar,m,i+1,c);
    }
    public static boolean sort(int ar[],int i){
        if(i==ar.length-1)
            return true;
        if(ar[i]>ar[i+1])
            return false;
        return sort(ar,i+1);
    }
}
