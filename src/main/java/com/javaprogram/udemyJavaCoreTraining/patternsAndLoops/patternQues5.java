package com.javaprogram.udemyJavaCoreTraining.patternsAndLoops;

public class patternQues5 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println(" ");
        }
    }
}
