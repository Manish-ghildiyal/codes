public class Ques14_7 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("ab(cd)e");
        String s1="ab(cdef)e";
        System.out.println("string inside parenthesis is "+paren(s1,0));
    }
    public static String paren(String s, int i)
    {
        if(i>=s.length())
            return s;
        if(s.charAt(i)=='(')
        {
           s=s.substring(i+1);
           paren(s,0);

        }
        if(s.charAt(i)==')')
            s=s.substring(0,i);
        return paren(s,i+1);
    }
}
