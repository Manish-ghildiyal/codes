public class Ques8c_7 {
    public static void main(String[] args) {
        String s = "ahihib";
        StringBuilder s1=new StringBuilder(s);
        System.out.println("after removing 'hi' "+remove(s1,0));
    }
    public static StringBuilder remove(StringBuilder s,int i)
    {
        if(i>=s.length()-1)
            return s;
        if(s.charAt(i)=='h' && s.charAt(i+1)=='i')
        {
            s.deleteCharAt(i);
            s.deleteCharAt(i);
            s.insert(i,"bye");
            remove(s,i);

        }
        return remove(s,i+1);
    }

}
