package com;

import java.util.Scanner;

public class FreqCount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
 System.out.println(count(s1));
       // count(s1);
    }
    public static StringBuilder count(String s1){
        StringBuilder  s=new StringBuilder(s1);
        int count=1;
        for (int i = 0; i <s.length(); i++) {
            count=1;
            while (i != s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                s.deleteCharAt(i);
            }
            if(i==s.length()-1)
                s.append(count);
            else s.insert(i+1,count);
            i++;
        }
        return s;
    }
}
