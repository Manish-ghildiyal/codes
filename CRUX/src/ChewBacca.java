import java.util.Scanner;

public class ChewBacca {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int chew=0;
        int rem=0;
        int inv=0;
        while (n!=0){
            rem=n%10;
            inv=9-rem;
            if(inv<rem)
                chew=chew*10+inv;
            else chew=chew*10+rem;
            n=n/10;
        }
        System.out.println(chew);
    }
}
