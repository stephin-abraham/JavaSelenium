package com.javaprogram.udemyJavaCoreTraining.patternsAndLoops;

public class patternQues6 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println(" ");
        }
    }
}
