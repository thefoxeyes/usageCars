package com.ezopikhinaelena;

public class Bus extends Car {


    private int capacity;

    public Bus(Brand brand, int weight) {
        super(brand, weight);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void cargo() {
        System.out.println("Везу туристов!");
    }
}