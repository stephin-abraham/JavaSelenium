package com.javaprogram.udemyJavaCoreTraining.AbstractAndInterface;

public class australianTraffic implements CentralTraffic, continentalTraffic {
    public void walkOnSidewalk(){
        System.out.println("the pedestrians can wLK ON THE side walkS");
    }
    public void walkOnZebraLine(){
        System.out.println("the pedestrians can cross the road on Zebra crossing");
    }

    public static void main(String[] args) {
        CentralTraffic c = new australianTraffic();
        c.redStop();
        c.flashYellow();
        c.greenLight();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        continentalTraffic ct = new australianTraffic();
        ct.bridgeSymbol();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        australianTraffic a = new australianTraffic();
        a.walkOnSidewalk();
        a.walkOnZebraLine();
    }

    @Override
    public void greenLight() {
        System.out.println("You can go ");
    }

    @Override
    public void redStop() {
        System.out.println("You have to stop");
    }

    @Override
    public void flashYellow() {
        System.out.println("you have to wait");
    }

    @Override
    public void bridgeSymbol() {
        System.out.println("Look for the ships under the bridge");
    }
}
