package com.javaprogram.udemyJavaCoreTraining.set;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {
    public static void main(String[] args) {
//      HashSet trenset, LinkedBashaet implemente Set interface
//        does not accept duplicate values
//         There is no guarantee elements stored in sequential order. Random order

        HashSet<String> hs = new HashSet<String>();
        hs.add("Stephin");
        hs.add("Stephin");
        hs.add("Sagar");
        hs.add("PANDA");
        hs.add("Sagar");
        System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
        System.out.println(hs.contains("PANDA"));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        //iterator
        Iterator<String> i = hs.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
