import java.util.Arrays;

public class Ques12 {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        System.out.println("array after reversing is "+ Arrays.toString(reverse(ar,0,ar.length-1)));
    }
    public static int[] reverse(int ar[],int i,int j)
    {
        if(i>j)
            return ar;
        else
        {
            int temp=ar[j];
            ar[j]=ar[i];
            ar[i]=temp;
            reverse(ar,i+1,j-1);
            return ar;
        }

    }
}
