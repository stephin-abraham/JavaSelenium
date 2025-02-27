package com.javaprogram.udemyJavaCoreTraining.patternsAndLoops;

public class patternQues3 {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                System.out.print("\t");
            }
            System.out.println(" ");
        }
    }
}

//output
//        1
//        1	2
//        1	2	3
//        1	2	3	4