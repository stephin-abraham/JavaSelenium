package com.javaprogram.udemyJavaCoreTraining.arrays;

public class multidimensionalArray {
    public static void main(String[] args) {
        //a[row][col]
        int[][] a =new int[2][3];
        a[0][0]=2;
        a[0][1]=4;
        a[0][2]=5;
        a[1][0]=3;
        a[1][1]=4;
        a[1][2]=7;

        for(int i=0;i<2;i++) {      //row
            for(int j=0;j<3;j++){       //col
                System.out.println(a[i][j]);
            }
        }
    }
}
