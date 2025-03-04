package com.javaprogram.basicquestions;

public class    palindrome {
    public static void Palindrome(int n){
        int remainder, reverseNum=0, originalNum;
        originalNum = n;
        while(n != 0){
            remainder = n%10;
            reverseNum = reverseNum *10 + remainder;
            n /= 10;
        }
        if(originalNum == reverseNum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    public static void main(String[] args) {
        Palindrome(127);
    }
}
