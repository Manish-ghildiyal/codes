public class Ques4_7 {
    public static void main(String[] args) {
        String s="abba";
        System.out.println("string is pallindrome "+pallindrome(s,0));
    }
    public static boolean pallindrome(String s,int i)
    {
        if(i> s.length()/2)
            return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1))
            return false;
        return pallindrome(s,i+1);
    }
}
