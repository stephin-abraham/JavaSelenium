package com.javaprogram.udemyJavaCoreTraining.arrays;

public class swapWithoutVariable {
    public static void main(String[] args) {
        int a=10, b=15;
        a=a+b; //10+15=25
        b=a-b;  //25-15=10
        a=a-b;  //25-10 = 15
        System.out.println(a+" is a and b= "+b);
    }
}
