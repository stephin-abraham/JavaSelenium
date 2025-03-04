package com.javaprogram.udemyJavaCoreTraining.exceptionHandling;

public class exceptionDemo {


    public static void main(String[] args) {
        int a=0, b=7;
        try{
//            int k=b/a;
            int arr[] ={28,18,1,2,5};
            System.out.println(arr[9]);
        }
        catch(ArrayIndexOutOfBoundsException ab){
            System.out.println("out of bound");
        }
        catch(ArithmeticException et){
            System.out.println("this is arithmetic exception error");
        }
        catch(Exception e){
            System.out.println("error catched and exception done");
        }
    }
}
