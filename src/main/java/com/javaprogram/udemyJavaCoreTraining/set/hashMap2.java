package com.javaprogram.udemyJavaCoreTraining.set;

import java.util.HashMap;

public class hashMap2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer,String>();
        hm.put(101,"Stephin");
        hm.put(102,"Sagar");
        hm.put(null,null);
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());

        hm.replace(null,"Panda");
        System.out.println(hm);
    }
}
