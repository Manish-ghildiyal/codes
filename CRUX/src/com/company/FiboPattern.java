package com.company;

import java.util.Scanner;

public class FiboPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1;
        int row=1;
        int col=0;
        while(row<=n){
            col=row;
            while (col>0){
                System.out.print(a+"  ");
                col--;
                //int c=a+b;
                b=a+b;
                a=b-a;
            }
            row++;
            System.out.println();

        }
    }
}
