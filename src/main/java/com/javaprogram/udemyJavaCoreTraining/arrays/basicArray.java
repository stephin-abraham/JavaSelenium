package com.javaprogram.udemyJavaCoreTraining.arrays;

public class basicArray {
    public static void main(String[] args) {
        int[] a= new int[5];
        a[0]=1;
        a[1]=10;
        a[2]=35;
        a[3]=7;
        a[4]=15;

//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }

        int[] b= {26,12,36,0,18};
        for(int j=0;j<b.length;j++){
            System.out.println(b[j]);
        }
    }
}
