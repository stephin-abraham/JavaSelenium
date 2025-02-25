package com.javaprogram.basicquestions;

import java.util.Scanner;

public class swapping2Numbers {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER 2 numbers");
        x= sc.nextInt();
        y= sc.nextInt();
        System.out.println("Before swapping the numbers are "+x +" and "+ y);
        z=x;
        x=y;
        y=z;
        System.out.println("After swapping the numbers are "+x+" "+y);
    }
}
