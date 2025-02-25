package com.javaprogram.basicquestions;

import java.util.Scanner;

public class evenOdd {
    public static void evenOrOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
            if(n % 2 == 0){
                System.out.println("the number "+n+ "is Even");
            }
            else{
                System.out.println("the number "+n+ "is Odd");
            }
    }
    public static void main(String[] args) {
        evenOrOdd();
    }
}
