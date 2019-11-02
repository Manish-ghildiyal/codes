import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class SubstringPallindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string ");
        String s1=s.nextLine();
        System.out.println("no. of string pallindrome is "+pallindrome(s1));
    }
    public static int pallindrome(String s1)
    {
        int count=0;
        StringBuilder s=new StringBuilder(s1);
        for (int i = 0; i <s.length() ; i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                String s2=s.substring(i,j);
                boolean b=check(s2);
                if(b==true)
                    count++;
            }
        }
    return count;
    }
    public static boolean check(String s2)
    {
        for (int i = 0; i <s2.length()/2 ; i++) {
            if(s2.charAt(i)!= s2.charAt(s2.length()-i-1))
                return false;
        }
        return true;
    }
}
