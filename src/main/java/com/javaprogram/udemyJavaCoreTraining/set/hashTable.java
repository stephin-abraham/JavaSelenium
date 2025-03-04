package com.javaprogram.udemyJavaCoreTraining.set;

import java.util.Hashtable;

public class hashTable {
    public static void main(String[] args) {
        //1. Synchronization or Thread Safe: This is the most important difference
//        between two. HashMap is non synchronized and not thread safe. On the other hand, HashTable is thread safe and synchronized. When to use HashMap? answer is if your application do not require any multi-threading task, in other words hashmap is better for non-threading applications. HashTable should be used in multithreading applications.
//        2. Null keys and null values: Hashmap allows one null key and any number of null values, while Hashtable do not allow null keys and null values in the HashTable object.
//        3. Iterating the values: Hashmap object values are iterated by using iterator HashTable is the only class
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
        ht.put(1,"one");
        ht.put(0,"fail");
        ht.put(3,"one");
        ht.put(6,"Zero");
        ht.put(2,"fail");
        System.out.println(ht);
        System.out.println(ht.isEmpty());
        System.out.println(ht.contains("one"));
        System.out.println(ht.remove(1));
    }
}
