package com.javaprogram.arrayprogram;

public class arrayDeclaration {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]= 1;
        arr[1]= 21;
        arr[2]= 54;
        arr[3]= 0;
        arr[4]= 62;
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
