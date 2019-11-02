public class Ques15_7 {
    public static void main(String[] args) {
        String s="{a+{b}+";
        System.out.println("brackets are closed "+paren(s,0,s.length()-1));
    }
    public static boolean paren(String s,int i,int j)
    {
        if(i==s.length() )
            return true;
        if(s.charAt(i)=='{')
        {
            if(s.charAt(j)=='}')
                paren(s,i+1,j-1);
            if(i<j)
                paren(s,i,j-1);
            if(i>=j)
                return false;
        }
        return paren(s,i+1,j);
    }
}
