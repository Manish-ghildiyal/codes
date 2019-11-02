package com.company;

public class Leap {
    public static void main(String[] args) {
       int salary=5000;
       if(salary>=0)
       {
           salary=salary+3000;
       }
       else
       {
           salary=salary+1000;
       }
        System.out.println("salary after bonus is- "+salary);

    }
}
