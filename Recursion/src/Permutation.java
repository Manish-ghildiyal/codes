public class Permutation {
    public static void main(String[] args) {
        String processed = "";
        String unprocessed = "abc";
        sub(processed, unprocessed);
    }

    public static void sub(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        //String first="",second="";
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        for (int i = 0; i <=processed.length() ; i++) {
            String first=processed.substring(0,i);
            String second=processed.substring(i);
            sub(first+ ch + second, unprocessed);

        }
    }
}