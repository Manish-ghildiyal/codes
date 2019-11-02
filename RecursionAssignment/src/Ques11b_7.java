public class Ques11b_7 {
    public static void main(String[] args) {
        String s="haaaaaahaaaa";
        StringBuilder s1=new StringBuilder(s);
        System.out.println("no. of 'aaa' is "+count(s1,0));
    }
    public static int count(StringBuilder s,int i)
    {
        if(i>s.length()-2)
            return 0;
        if ((s.charAt(i)==s.charAt(i+1) )&& (s.charAt(i+1)==s.charAt(i+2)))
        {
            s.deleteCharAt(i);
            s.deleteCharAt(i);
            s.deleteCharAt(i);
            return 1+count(s,i);
        }
        return  count(s,i+1);

    }
}
