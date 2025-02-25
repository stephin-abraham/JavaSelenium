package com.javaprogram.basicquestions;

public class swapping2NumsWIthout3rdum {
    public static void main(String[] args) {
        int a=5, b=10;
        System.out.println("The first number is "+a);
        System.out.println("The second number is "+b);
        System.out.println("before swapping the numbers is a= "+a+" and b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping the numbers is a= "+a+" and b="+b);
    }
}
