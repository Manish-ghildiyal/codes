package com.company;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        int f=n;
        while(n>0)
        {
            sum=a+b;
            a=b;
            b=sum;
            n--;
        }
        System.out.println(f+"th fibonacci is- "+a);
    }
}
