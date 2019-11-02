import java.util.Scanner;

public class RemovesDuplicates {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in) ;
        System.out.println("enter string ");
        String s1=s.nextLine();
        System.out.println("string after removing consecutive duplicates- "+dup(s1));

    }
    public static StringBuilder dup(String s1)
    {
        StringBuilder s=new StringBuilder(s1);
        for (int i = 0; i <s.length()-1 ; i++) {
                         if(s.charAt(i)==s.charAt(i+1))
                             s.deleteCharAt(i);
        }
        return s;
    }
}
