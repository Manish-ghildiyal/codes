import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[]={1,3,2,5,4};
        quick(a,0,a.length);
        System.out.println(Arrays.toString(a));
    }
    public static void quick(int ar[],int start,int end)
    {
        if(end<=start)
            return;
        int pivot=end-1;
        pivot=pivotAdjust(ar,start,pivot);
        quick(ar,start,pivot);
        quick(ar,pivot+1,end);
    }
    public static int pivotAdjust(int []ar,int start,int pivot)

    {
        int j=start;
        for (int i = start; i <pivot ; i++) {
            if(ar[i]<ar[pivot])
            {
                int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
                j++;
            }
        }
        int temp=ar[pivot];
        ar[pivot]=ar[j];
        ar[j]=temp;
        return j;
    }
}
