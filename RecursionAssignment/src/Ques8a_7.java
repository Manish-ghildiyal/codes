public class Ques8a_7 {
    public static void main(String[] args) {
        String s="hiahihibhi";
        StringBuilder s1=new StringBuilder(s);
        System.out.println("'hi' is present "+count(s1,0)+" times");
    }
    public static int count(StringBuilder s,int i)
    {
        if(i==s.length()-1)
            return 0;
        if(s.charAt(i)=='h' && s.charAt(i+1)=='i')
            return 1+count(s,i+1);
        return count(s,i+1);
    }
}
