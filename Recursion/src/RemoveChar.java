public class RemoveChar {
    public static void main(String[] args) {
        String processed = "";
        String unprocessed = "abcb";
        sub(unprocessed,processed,'b');
    }

    public static void sub(String unprocessed,String processed,char target) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        //String first="",second="";
        char ch=unprocessed.charAt(0);
        //unprocessed=unprocessed.substring(1);

            if(ch==target) {
                sub(unprocessed .substring(1),processed ,target);

        }
            else {
                sub(unprocessed.substring(1),processed+ch,target);
            }
    }
}
