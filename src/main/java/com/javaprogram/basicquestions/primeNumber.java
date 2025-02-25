package com.javaprogram.basicquestions;

import java.util.Scanner;

public class primeNumber {
    public static boolean primeNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(primeNumber(n)){
            System.out.println("the entered number "+n+" is prime");
        }
        else{
            System.out.println("the entered number "+n+" is not prime");
        }
    }
}
