package com.javaprogram.udemyJavaCoreTraining.set;

import java.util.*;

public class hashMap {
    public static void main(String[] args) {
//        1. Synchronization or Thread Safe: This is the most important difference
//        between two. HashMap is non synchronized and not thread safe. On the other hand, HashTable is thread safe and synchronized. When to use HashMap? answer is if your application do not require any multi-threading task, in other words hashmap is better for non-threading applications. HashTable should be used in multithreading applications.
//        2. Null keys and null values: Hashmap allows one null key and any number of null values, while Hashtable do not allow null keys and null values in the HashTable object.
//        3. Iterating the values: Hashmap object values are iterated by using iterator HashTable is the only class other than vector which uses enumerator to iterate the values of HashTable object.
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(0,"Stephin");
        hm.put(25,"Messi");
        hm.put(17,"Ronaldo");
        hm.put(2,"Curry");
        hm.put(16,null);
        hm.put(null,null);
        System.out.println(hm);
        System.out.println(hm.get(25));
        //Set
        Set s = hm.entrySet();
        Iterator i= s.iterator();
        //hashtable- pass table set collections
        while(i.hasNext()){
            Map.Entry mp = (Map.Entry)i.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }

    }
}
