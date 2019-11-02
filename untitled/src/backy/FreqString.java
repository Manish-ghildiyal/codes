package backy;

import java.util.Arrays;

public class FreqString {

    public static void main(String[] args) {
	// write your code here
        String s="aabbc";
        freq(s);
    }
    public static void freq(String s)
    {
        int []f=new int[26];
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            f[ch-'a']++;
        }
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            System.out.println("frequency of "+ch+" is "+ f[ch-'a']);
        }
        System.out.println(Arrays.toString(f));

    }
}
