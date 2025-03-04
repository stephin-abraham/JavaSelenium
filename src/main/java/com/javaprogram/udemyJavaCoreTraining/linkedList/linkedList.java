package com.javaprogram.udemyJavaCoreTraining.linkedList;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("Cat");
        l.add("Dog");
        l.add("Tiger");
        System.out.println(l.get(1));
        System.out.println(l.size());
        l.set(1,"Lion");
        System.out.println(l);
        System.out.println(l.contains("Lion"));
        l.remove(0);
        System.out.println(l);
    }
}
