package com.javaprogram.arrayprogram;

public class sumOfElementsInArray {
    public static void main(String[] args) {
        int[] arr= {10,20,30,100};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum= sum + arr[i];
        }
        System.out.println("sum of the array elements is: "+sum);
    }
}
