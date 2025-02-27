package com.javaprogram.udemyJavaCoreTraining.string;

public class stringClassDemo {
    public static void main(String[] args) {
        String a =" Stephin&Sagar";
        System.out.println(a.charAt(2));
        System.out.println(a.toUpperCase());
        System.out.println(a.indexOf("p"));
        System.out.println(a.substring(1,4));
        System.out.println(a.concat(" Philip Abraham"));
        System.out.println(a.length());
        System.out.println(a.trim());
        System.out.println(a.replace("&","-"));
    }
}
