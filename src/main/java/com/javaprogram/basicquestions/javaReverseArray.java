package com.javaprogram.basicquestions;

public class javaReverseArray {
    public static void main(String[] args) {
        int[] arr ={23,172,171,47,181,167};
        int b[] = new int[arr.length];
        int count=0;
        for(int i= arr.length-1; i>=0;i--){
            b[count]=arr[i];
            count++;
        }
        for(int i=0;i<=b.length-1;i++)
        {
            System.out.println(b[i]);
        }
    }
}
