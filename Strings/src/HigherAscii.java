import java.util.Scanner;

public class HigherAscii {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String ");
        String s1=s.nextLine();
        System.out.println(ascii(s1));
    }
    public static StringBuilder ascii(String s1)
    {
        StringBuilder b=new StringBuilder(s1);
        for (int i = 0; i <s1.length() ; i++) {
            if(i%2==0)
            {
                char ch=s1.charAt(i);
                ch=(char)((int)ch-1);
                b.setCharAt(i,ch);
                //b.append((char)((int)ch-1));
            }
            else
            {
                char ch=s1.charAt(i);
                ch=(char)((int)ch+1);
                b.setCharAt(i,ch);
                //b.append((char)((int)ch+1));
            }

        }
        return b;
    }
}
