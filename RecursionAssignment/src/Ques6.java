public class Ques6 {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,4};
        System.out.println("array is sorted - "+sort(ar,0));
    }
    public static boolean sort(int []ar,int i)
    {
        if(i==ar.length-1)
            return true;
        if(ar[i]>ar[i+1])
            return false;
        return sort(ar,i+1);
    }
}
