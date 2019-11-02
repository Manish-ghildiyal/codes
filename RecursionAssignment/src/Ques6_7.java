public class Ques6_7 {
    public static void main(String[] args) {
        String s="hello";
        StringBuilder s1=new StringBuilder(s);
        System.out.println("string after removing duplicates "+duplicate(s1,0));
    }
    public static StringBuilder duplicate(StringBuilder s,int i)
    {
        /*
        if(i>=s.length()-1)
            return s;
        if(s.charAt(i)==s.charAt(i+1))
            s.deleteCharAt(i);
        return duplicate(s,i+1);
*/
        if(i==s.length()-1)
            return s;
        if(s.charAt(i)==s.charAt(i+1)) {
            s.deleteCharAt(i);
            duplicate(s,i);
        }
        return duplicate(s,i+1);

    }


}
