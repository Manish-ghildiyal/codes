package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        System.out.println("enter size- ");
        int n1=s.nextInt();
        int []a=new int[20];
        System.out.println("enter array ");
        for (int i = 0; i <n1 ; i++) {a[i] = s.nextInt();}
        System.out.println("enter size again ");
        int n2=s.nextInt();
        System.out.println("enter array ");
        for (int i = 0; i <n2 ; i++) {
            a[n1+i]=s.nextInt();
        }
        System.out.println("array is\n");
        System.out.print("[\t");
        for (int i = 0; i <n1+n2 ; i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.print("]");
        reverse(a,n1+n2);
    }
    public static void reverse(int a[],int n)
    {
        int[] ar=new int[n];
        for (int i = 0; i <n ; i++) {
            ar[i]=a[n-i-1];
        }
        System.out.println();
        System.out.println("array after reversing is\n");
        System.out.print("[\t");
        for (int i = 0; i <n ; i++) {
            System.out.print(ar[i]+"\t");
        }
        System.out.print("]");
    }
}
