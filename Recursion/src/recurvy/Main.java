package recurvy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no.- ");
        int r=s.nextInt();
        pd(r);
        System.out.println("done");
    }

    public static void pd(int r) {
        if (r>=1){
       // System.out.println(r);
        pd(r-1);
        System.out.println(r);
    }
}}