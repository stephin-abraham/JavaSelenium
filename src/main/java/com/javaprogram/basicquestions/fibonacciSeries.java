package com.javaprogram.basicquestions;

public class fibonacciSeries {
    public static void main(String[] args) {
        int n1=0,n2=1,n3, count=10;
        System.out.print (n1+" "+n2+" ");
        for(int i=2;i<count;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
        }
    }
}

//or

//class Main {
//    public static void fibonacciSeries(int n){
//        int n1=0,n2=1,n3;
//        System.out.print(n1+" "+n2+" ");
//        for(int i=2;i<n;i++){
//            n3=n1+n2;
//            n1=n2;
//            n2=n3;
//            System.out.print(n3+" ");
//        }
//    }
//    public static void main(String[] args) {
//        fibonacciSeries(10);
//    }
//}
