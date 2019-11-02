public class Subsequence {
    public static void main(String[] args) {
        String processed="";
        String unprocessed="ab";
        sub(processed,unprocessed);
    }
    public static void sub(String processed ,String unprocessed)
    {
        if (unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        sub(processed+ch,unprocessed);
        //sub(processed+ch,unprocessed);
        sub(processed,unprocessed);
    }
}
