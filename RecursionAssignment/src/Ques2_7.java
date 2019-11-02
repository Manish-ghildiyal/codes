public class Ques2_7 {
    public static void main(String[] args) {
        String s="123";
        System.out.println("no. is "+number(s,0,0));
    }
    public static int number(String s,int i,int n)
    {
        if(s.length()==i)
            return n;
        char ch=s.charAt(i);
        n=n*10;
        n= n+((int)ch-48);
        return number(s,i+1,n);
    }
}
