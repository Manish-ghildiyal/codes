public class Ques3 {
    public static void main(String[] args) {
        // write your code here
        int n = 4;
        patt(4, 0);
    }

    public static void patt(int row, int col) {

        if (row == 0)
            return;
        if (row == col) {
             System.out.println();
            patt(row - 1, 0);
            //System.out.println();
            return;
        }
        System.out.print("*");
        patt(row, col + 1);
        //System.out.print("*");

    }
}