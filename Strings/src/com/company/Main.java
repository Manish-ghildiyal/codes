package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1="hello";
        //System.out.println(s1);
        //System.out.println( s1.charAt(0));
        //System.out.println(s1.length());
        //String s2="world";
        //s2=s2+s1;
       // String s3="hello";
        //System.out.println((s3==s1));
        //System.out.println(s1.equals(s3));

       // s1.charAt(0)=(String)s2;
       // System.out.println(s2);
        for (int i = 0; i <s1.length() ; i++) {
           // System.out.println(s1.charAt(i));
              s1.charAt(i);
        }
        //System.out.println(s1.substring(0));
        /*for (int i = 0; i <=s1.length() ; i++) {
            for (int j = i+1; j <s1.length() +1; j++) {
                System.out.println(s1.substring(i,j));
            }
        }*/
        System.out.println(s1.indexOf("l"));
    }
}
