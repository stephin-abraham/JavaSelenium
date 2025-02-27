package com.javaprogram.udemyJavaCoreTraining;

import org.checkerframework.checker.units.qual.C;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        System.out.println(sd.format(c.getTime()));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.WEEK_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
    }
}
