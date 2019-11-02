import java.util.Arrays;

public class Ques14 {
    public static void main(String[] args) {
        int a[]={1,5,3,4,2};
        bubble(a,a.length-1,0);
        System.out.println(Arrays.toString(a));
    }
    public static void bubble(int[] a,int row ,int col)
    {
        if(row==0)
            return;
        if(row==col)
        {
            bubble(a,row-1,0);
            return;
        }
        if(a[col]>a[col+1])
        {
            int temp=a[col];
            a[col]=a[col+1];
            a[col+1]=temp;
        }
        bubble(a,row,col+1);

    }
}
