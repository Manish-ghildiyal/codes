import java.util.Arrays;

public class LexoPermute {
    public static void main(String[] args) {
        String s = "abc";
        int fre[];
        fre = freq(s);
        String processed="";
        permute(processed,s.length(),fre);
        //System.out.println(Arrays.toString(fre));
    }

    public static int[] freq(String s) {
        int[] f = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            f[ch - 'a']++;
        }
        return f;
    }
    public static void permute(String processed,int l,int[] fre)
    {
        if(l==0)
        {
            System.out.println(processed);
            return;
        }
        for (int i = 0; i <fre.length ; i++) {
            if(fre[i]>0)
            {
                fre[i]--;
                permute(processed+(char)(i+'a'),l-1,fre);
                fre[i]++;
            }
        }
    }
}
