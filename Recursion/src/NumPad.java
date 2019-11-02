public class NumPad {
    public static void main(String[] args) {
        String unprocessed="12";
        String processed="";
        num(unprocessed,processed);
    }
    public static void num(String unprocessed,String processed)

    {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        int digit=unprocessed.charAt(0)-'0';
        for (int i = 3*(digit-1); i <3*digit; i++) {
            if(i==26)
                continue;
            char ch=(char)(i+'a');
            num(processed+ch,unprocessed.substring(1));
        }
        }
    }

