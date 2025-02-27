package com.javaprogram.udemyJavaCoreTraining.arrays;

public class maxValueInArray {
    public static void main(String[] args) {
        int a[][]={{3,1,6},{0,9,2},{4,16,24}};
        int max= a[0][0];       //assume frst index value as the maximum value
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a[i][j]>max){           //cmparing the index values with max value
                    max=a[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
