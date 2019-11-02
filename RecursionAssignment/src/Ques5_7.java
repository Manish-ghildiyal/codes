public class Ques5_7 {
    public static void main(String[] args) {
        String s="hello";
        StringBuilder s1=new StringBuilder();
        System.out.println("string after applying condition "+duplicate(s ,s1,0));
    }
    public static StringBuilder duplicate(String s,StringBuilder s1,int i)
    {
        if(i==s.length()-1) {
            char ch=s.charAt(s.length()-1);
            s1.append(ch);
            return s1;
        }
        char ch=s.charAt(i);
        char ch1=s.charAt(i+1);
        s1.append(ch);
        if(ch==ch1)
            s1.append('*');
        return duplicate(s,s1,i+1);
    }
}
