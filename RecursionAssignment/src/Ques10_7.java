public class Ques10_7 {
    public static void main(String[] args) {
        String s="axaxa";
        System.out.println("no. of twins is "+twins(s,0));
    }
    public static int twins(String s,int i)
    {
        if(i==s.length()-2)
            return 0;
        if (s.charAt(i)==s.charAt(i+2))
            return 1+twins(s,i+1);
        return twins(s,i+1);
    }
}
