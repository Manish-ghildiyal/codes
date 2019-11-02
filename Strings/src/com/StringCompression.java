import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in) ;
        System.out.println("enter string");
        String s1=s.nextLine();
        System.out.println("string after compression is "+comp(s1));
    }
    public static StringBuilder comp(String s1)
    {
        int f=1;
        StringBuilder s=new StringBuilder(s1);
        for (int i = 0; i <s.length()-1 ; i++) {

            f=1;int c=s.length()-i;
            while(c>1) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    s.deleteCharAt(i + 1);
                    f++;
                }c--;
            }
            if(f>1)
            {
                s.insert(i+1,f);
                i++;
            }
        }
        return s;
    }
}
