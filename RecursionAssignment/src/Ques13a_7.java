public class Ques13a_7 {
    public static void main(String[] args) {
        String s="bc";
        System.out.println(condition(s,0));
    }
    public static boolean condition(String s,int i)
    {
        if(s.charAt(i)=='a')
            return true;
        return false;
    }
}
