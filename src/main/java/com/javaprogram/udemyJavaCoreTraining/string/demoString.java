package com.javaprogram.udemyJavaCoreTraining.string;

public class demoString {
    public static void main(String[] args) {
        String a= "hello";      //string literal-mutable-> means it can be changed/editable
        String b="hello";
        System.out.println(a.equals(b)); //true
        System.out.println(a==b);           //true

        String s = new String("hello");     //String class creates new objects evrytime in memory
        System.out.println(a.equalsIgnoreCase(s));      //true

        //StringBuffer and StringBuilder- Mutable- means it can be changed/editable
        StringBuffer sf= new StringBuffer("hello");
        sf.append("All");
        System.out.println(sf);
        sf.insert(5,"-");
        System.out.println(sf);
        sf.replace(5,7,"LA");
        System.out.println(sf);
        sf.delete(5,6);
        System.out.println(sf);
        sf.reverse();
        System.out.println(sf);

        //StringBuilder is not thread safe. It is non synchronized, it is faster
    }
}
