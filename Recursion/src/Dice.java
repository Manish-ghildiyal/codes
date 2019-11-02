public class Dice {
    public static void main(String[] args) {
        String processed = "";
        String unprocessed = "abc";
        sub(processed,3);
    }

    public static void sub(String processed,int target) {
        if (target==0) {
            System.out.println(processed);
            return;
        }
        //String first="",second="";
        for (int i = 1; i <=6 && i<=target ; i++) {
            sub(processed+i,target-i);
        }
    }
}
