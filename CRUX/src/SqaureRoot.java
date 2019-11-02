import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class SqaureRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no.");
        int f = s.nextInt();
        float ans=search(f);
        float a=0.1f;
        int precision=4;
        for (int i = 0; i <4; i++) {
            while (ans*ans<f)
            {
                ans=ans+a;
            }
            ans=ans-a;
            a=a/10;
        }
        System.out.printf(" %."+precision+"f",ans);
    }

    public static int search(int n) {
        int f = 0;
        int l = n;
        int ans=0;
        int mid = 0;
        while (f <= l) {
            mid = (f + l) / 2;
            if (mid*mid==n)
            {
                return mid;
            }
            else if(mid*mid<=n) {
                ans = mid;
                f = mid + 1;
            }
            else {
                l = mid - 1;
            }

        }

        return ans;
    }
}