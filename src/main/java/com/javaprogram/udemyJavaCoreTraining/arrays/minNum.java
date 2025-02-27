package com.javaprogram.udemyJavaCoreTraining.arrays;

public class minNum {
    public static void main(String[] args) {
        int[][] arr= {{2,3,1},{7,8,5},{10,9,0}};
        int min = arr[0][0];   //assign the frst value as min value at beginning
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j] < min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
