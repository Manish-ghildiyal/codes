import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class StringPallindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        System.out.println(pallindrome(s1));
    }
    public static boolean pallindrome(String s1)
    {
        int start=0;
        int end=s1.length()-1;
        while(start<end)
        {
            if(s1.charAt(start)!=s1.charAt(end))
                return false;
            else
            {end--;start++;
        }

        }
        return true;
    }
}
