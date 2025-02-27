package com.javaprogram.udemyJavaCoreTraining.constructor;

public class constructorDemo {
    public constructorDemo(){
        System.out.println("Helloo im in the constructor block");
    }
    public void test(){
        System.out.println("this is a mock test");
    }
    public static void main(String[] args) {
        constructorDemo c = new constructorDemo();
        c.test();
    }
}
