package com.ezopikhinaelena;

public class Truck extends Car{
    public Truck(Brand brand, int weight) {
        super(brand, weight);
    }
    private int wheelPair;

    public int getWheelPair() {
        return wheelPair;
    }

    public void setWheelPair(int wheelPair) {
        this.wheelPair = wheelPair;
    }
    @Override
    public void cargo() {
        System.out.println("Везу товары!");
    }
}
