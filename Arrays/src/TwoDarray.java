import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] ar = new int[3][3];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = s.nextInt();
            }
        }
        horizontal(ar);
    }
    public static void horizontal(int[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < ar[i].length; j++) {
                    System.out.print(ar[i][j]);

                }
            } else
                for (int j = ar[i].length-1; j < ar.length - 1; j--) {
                    System.out.print(ar[i][j]);

                }
        }

        System.out.println();
    }


    }

