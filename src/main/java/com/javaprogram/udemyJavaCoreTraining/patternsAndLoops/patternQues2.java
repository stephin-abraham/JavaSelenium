package com.javaprogram.udemyJavaCoreTraining.patternsAndLoops;

public class patternQues2 {
    public static void main(String[] args) {
        int k=1;
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println(" ");
        }
    }
}

//output
//        1
//        2	3
//        4	5	6
//        7	8	9	10
