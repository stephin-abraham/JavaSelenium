package com.javaprogram.udemyJavaCoreTraining.patternsAndLoops;

public class nestedForLoop {
    public static void main(String[] args) {
        //outer for loop
        for(int i =1;i<=4;i++){
            System.out.println("outer loop started");
            //inner for loop
            for(int j=1;j<4;j++){
                System.out.println("inner loop started");
            }
            System.out.println("outer loop finished");
        }
    }
}
