public class Ques1_7 {
    public static void main(String[] args) {
        //String s=""
        String s="123";
        //
        // System.out.println((int)ch-48);
        System.out.println("sum is "+count(s,0));
    }
    public static int count(String s,int i)
    {
        if(s.length()==i)
            return 0;
        char ch=s.charAt(i);
        return (int)ch-48 + count(s,i+1);
    }
}
