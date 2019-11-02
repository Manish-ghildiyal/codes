import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        int ar[]={1,1,2,2,1,3};
        //int ar1[]=new int[ar.length];
        ArrayList<Integer> ar1 = new ArrayList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("enter no ");
        int n=s.nextInt();
        System.out.println("found no. is on following indices "+indices(ar,ar1,n,0,0));
    }
    public static ArrayList indices(int []ar,ArrayList<Integer> ar1,int n, int i,int j)
    {
        if(ar.length-1==i)
            return ar1;
        if(ar[i]==n)
        {
            ar1.add(i);
        }
        return indices(ar,ar1,n,i+1,j);
    }
}
