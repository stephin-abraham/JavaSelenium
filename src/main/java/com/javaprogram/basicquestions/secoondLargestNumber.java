package com.javaprogram.basicquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class secoondLargestNumber {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<Integer>();
        l.add(34);
        l.add(1);
        l.add(78);
        l.add(87);
        l.add(10);
        Collections.sort(l);
        System.out.println("The largest number is "+l.get(l.size()-1));
        System.out.println("The second largest number is "+l.get(l.size()-2));
    }
}
