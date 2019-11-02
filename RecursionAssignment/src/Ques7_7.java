public class Ques7_7 {
    public static void main(String[] args) {
        String s="axcxxxx";
        StringBuilder s1=new StringBuilder(s);

        side(s1,0);
        s1.deleteCharAt(s.length()-1);
        System.out.println(s1);

    }
    public static StringBuilder side(StringBuilder s,int i)
    {
        if(i>=s.length())
        {
            s.append('x');
//
        return s;
        }

        if(s.charAt(i)=='x' ){
            s.deleteCharAt(i);

            side(s,i);
        }
        return side(s,i+1);
    }
}
