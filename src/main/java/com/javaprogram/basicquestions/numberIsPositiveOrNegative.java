package com.javaprogram.basicquestions;

import java.util.Scanner;

public class numberIsPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num= sc.nextInt();
        if(num>=0){
            System.out.println("number is positive");
        }
        else {
            System.out.println("number is negative");
        }
    }
}
