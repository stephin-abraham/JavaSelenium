package com.javaprogram.udemyJavaCoreTraining;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        System.out.println(d.toString());
        System.out.println(sd.format(d));
        System.out.println(sdf.format(d));
    }
}
