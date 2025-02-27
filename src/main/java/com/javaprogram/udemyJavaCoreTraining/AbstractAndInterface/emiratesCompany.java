package com.javaprogram.udemyJavaCoreTraining.AbstractAndInterface;

public class emiratesCompany extends parentAircraft{
    public static void main(String[] args) {
        emiratesCompany e = new emiratesCompany();
        e.engine();
        e.body();
        e.model();

        //you cannot create object of classes which is mentioned as Abstract class
    }

    @Override
    public void body() {
        System.out.println("the aircraft body is wide body");
    }
}
