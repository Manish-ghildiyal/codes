public class Ques9a_7 {
    public static void main(String[] args) {


    String s = "ahihitbhiti";
    StringBuilder s1=new StringBuilder(s);
        System.out.println("after removing 'hi' "+remove(s1,0));
}
    public static StringBuilder remove(StringBuilder s,int i)
    {
        if(i>=s.length()-2)
            return s;
        if(s.charAt(i)=='h' && s.charAt(i+1)=='i' && (s.charAt(i+2)!='t' ))
        {
            s.deleteCharAt(i);
            s.deleteCharAt(i);
            remove(s,i);

        }
        return remove(s,i+1);
    }
}
