package com.javaprogram.udemyJavaCoreTraining.constructor;

public class thisKeyword {
    int a=12;
    public void getData(){
        int a=18;

        int b= a+this.a;
        System.out.println(a);
        //this keyword refers to current object scope lies in the class level
        System.out.println(this.a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        thisKeyword t= new thisKeyword();
        t.getData();
    }
}
