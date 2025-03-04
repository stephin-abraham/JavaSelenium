package com.javaprogram.udemyJavaCoreTraining;

import java.util.ArrayList;

public class streamClass {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Adon");
        a.add("Ben");
        a.add("ABAC");
        a.add("Amal");
        a.add("Stephin");
        a.add("Don");
        int count=0;

        for(int i=0;i<a.size();i++){
            String actual = a.get(i);
            if(actual.startsWith("A")){
                count++;
            }
        }
        System.out.println(count);
    }
}
