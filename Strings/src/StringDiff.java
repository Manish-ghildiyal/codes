import java.util.Scanner;

public class StringDiff {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string");
        String s1=s.nextLine();
        System.out.println(diff(s1));
    }
    public static StringBuilder diff(String s1)
    {
        StringBuilder b=new StringBuilder();
        int j=0;
        for (int i = 0; i <s1.length()-1 ; i++) {
            char ch1=s1.charAt(i);
            char ch2=s1.charAt(i+1);
            b.append(ch1);
            int c= Math.abs((ch2-ch1));
            b.append(c);


        }
        char ch=s1.charAt(s1.length()-1);
        b.append(ch);
        return  b;
    }
}
