public class Ques13b_7 {
    public static void main(String[] args) {
        String s="ba";
        System.out.println(condition(s,0));
    }
    public static boolean condition(String s,int i)
    {
        if(i==s.length())
            return true;
//        if(s.charAt(i)=='a' && s.charAt(i+1)!='a')
//            return false;
        if(s.charAt(i)=='a' && s.charAt(i+1)!='a')
        {
            if(s.charAt(i)=='a'&& (s.charAt(i+1)!='b' && s.charAt(i+2)!='b'))
            return false;
        }

            return condition(s,i+1);
    }
}
