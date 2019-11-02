package backy;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {


    int ar[] = {1, 1,  3, 3,4};

    xor(ar);

}
public static void xor(int[] ar)
{
    int xo=ar[0];
    for (int i = 1; i <ar.length-1 ; i++) {
        xo=xo ^ ar[i];

    }
    System.out.println(xo);
    //System.out.println(Arrays.toString(ar));
}
}

