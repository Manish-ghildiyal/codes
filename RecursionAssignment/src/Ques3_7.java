public class Ques3_7 {
    public static void main(String[] args) {
        String s1="cca";
        String s2="acc";
        System.out.println("string is reverse "+reverse(s1,s2,0));
    }
    public static boolean reverse(String s1,String s2,int i)
    {
        if(s1.length()!=s2.length())
            return false;
        if(s1.length()==i)
            return true;
        if(s1.charAt(i)!=s2.charAt(s2.length()-i-1))
            return false;
        return reverse(s1,s2,i+1);
    }
}
