import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int a[]={4,3,2,1};
        System.out.println(Arrays.toString(divide(a)));
    }
    public static int[] divide(int []ar)
    {
        if(ar.length==1)
            return ar;
        int mid=ar.length/2;
        int first[]=divide(Arrays.copyOfRange(ar,0,mid));
        int second[]=divide(Arrays.copyOfRange(ar,mid,ar.length));
        return merge(first,second);
    }
    public static int[] merge(int first[],int second[] ) {
        int i = 0, j = 0, k = 0;
        int mix[]=new int[first.length+second.length];
        while(i<first.length && j<second.length) {
            if (first[i] > second[j]) {
                mix[k] = second[j];
                j++;
                k++;
            } else {
                mix[k] = first[i];
                i++;
                k++;
            }
        }
            while(i<first.length)
            {
                mix[k]=first[i];
                k++;
                i++;
            }
            while(j<second.length)
            {
                first[k]=second[j];
                k++;
                j++;
            }

        return mix;
    }
}
