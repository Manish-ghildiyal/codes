import java.util.Scanner;

public class FrequencyChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter String ");
        String s1=s.nextLine();
        System.out.println("max freq is of- "+freq(s1));
    }

    public static char freq(String s1) {
        int max=0;
        char ch='a';
        //ch = '';
        for (int i = 0; i <s1.length() ; i++) {
            int s=0;
            for (int j = i; j <s1.length() ; j++) {
                if(s1.charAt(i)==s1.charAt(j))
                {
                    s++;
                }
                if(s>max)
                {
                    max=s;
                    ch=s1.charAt(i);
                }
            }
        }
        return ch;
    }

}
