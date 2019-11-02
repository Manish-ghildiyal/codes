package backy;

import java.util.Scanner;

public class IncredibleHulk {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        for (int i = 0; i <n ; i++) {
            ar[i]=s.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            int count=0;
            while(ar[i]!=0)
            {
                if((ar[i]& 1)==1)
                    count++;
                ar[i]=ar[i]>>1;
            }
            System.out.println(count);
        }
    }
}
