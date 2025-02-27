package com.javaprogram.udemyJavaCoreTraining.constructor;

public class staticVar {
    String name;        //instance variables
    String address;
    String city;
    //static keyword              //class variABLES
    static int  mobNum= 873330282;

    staticVar(String name,String place,String city){
        this.name=name;
        this.address=place;
        this.city=city;
    }
    public void getData(){
        System.out.println(name);
        System.out.println(address+ " "+mobNum);
        System.out.println(city);
    }
    public static void main(String[] args) {
        staticVar s = new staticVar("Stephin","JP Nagar","Banglore");
        staticVar s1 = new staticVar("Sagar","HSR","Banglore");
        s1.getData();
        s.getData();
    }
}
