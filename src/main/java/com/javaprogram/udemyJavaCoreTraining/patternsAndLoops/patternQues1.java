package com.javaprogram.udemyJavaCoreTraining.patternsAndLoops;

public class patternQues1 {
    public static void main(String[] args) {
        int k=1;
        for(int i=0;i<4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println(" ");
        }
    }
}

//       output
//        1 2 3 4
//        5 6 7
//        8 9
//        10
