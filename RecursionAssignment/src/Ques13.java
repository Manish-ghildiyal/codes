import java.util.Arrays;

public class Ques13 {
    public static void main(String[] args) {
        int[] ar ={0,2,1,4,3};
        int[] br =new int[ar.length];
        System.out.println("array after inversing is "+ Arrays.toString(inverse(ar,br,0)));
    }
    public static int[] inverse(int[] ar,int[] br,int i)
    {
        if(i==ar.length)
            return br;
        else
        {
            int temp=ar[i];
            br[temp]=i;
            return inverse(ar,br,i+1);
        }
    }
}
