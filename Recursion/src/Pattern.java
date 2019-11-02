public class Pattern {
    public static void main(String[] args) {
        int n=4;
        patt(4,0);
    }
    public static void patt(int row,int col)
    {
        /*if(n>0) {

            if (i > 0) {
                System.out.print("*");
                 patt(n, i - 1);
            }
            if(n==i)
            System.out.println();
             patt(n - 1, n-1);
        }*/
        if(row==0)
            return;
         if(row==col)
         {
            // System.out.println();
             patt(row-1,0);
             System.out.println();
             return;
         }
        //System.out.print("*");
         patt(row,col+1);
        System.out.print("*");


    }
}
