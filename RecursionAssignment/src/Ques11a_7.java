public class Ques11a_7 {
    public static void main(String[] args) {
        String s="haaaaaa";
        System.out.println("no. of 'aaa' is "+count(s,0));
    }
    public static int count(String s,int i)
    {
        if(i==s.length()-2)
            return 0;
        if ((s.charAt(i)==s.charAt(i+1) )&& (s.charAt(i+1)==s.charAt(i+2)))
            return 1+count(s,i+1);
        return  count(s,i+1);
    }
}
