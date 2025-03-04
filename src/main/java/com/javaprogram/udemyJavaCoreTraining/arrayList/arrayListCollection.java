package com.javaprogram.udemyJavaCoreTraining.arrayList;

import java.util.ArrayList;

public class arrayListCollection {
    public static void main(String[] args) {
        //can accept duplicates values
        //ArrayList,LinkedList,Vector- Implementing List Interface
        //array can have fixed sizes whereas arraylist can grow dynamically
        //you can access and insert value in any index
        ArrayList<String> a = new ArrayList<String>();
        a.add("Stephin");
        a.add("Sagar");
        a.add("Panda");
        System.out.println(a);
        a.add(1,"Dhanush");
        System.out.println(a);
//        a.remove(1);
//        System.out.println(a);
        System.out.println(a.get(2));
        System.out.println(a.contains("Stephin"));
        System.out.println(a.indexOf("Panda"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
    }
}
