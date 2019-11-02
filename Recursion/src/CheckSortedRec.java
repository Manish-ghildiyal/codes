public class CheckSortedRec {
    public static void main(String[] args) {
        int []a={1,2,3,4};
        System.out.println("array is sorted "+sort(a,0));
    }
    public static boolean sort(int[] a,int i)
    {
        if(i==a.length-1)
            return true;
        if(a[i]>a[i+1])
            return false;
        return sort(a,i+1);
    }
}
