package com.ezopikhinaelena;

import com.sun.jdi.Value;

public abstract class Car implements ICar {
    private Brand brand;
    private int weight;
    private String[] engine = new String[]{"gas", "diesel", "electro", "hybrid"};
    public String getEngine(int index){
        return engine[index];
    }
    public Car(Brand brand, int weight) {
        this.brand = brand;
        this.weight = weight;
    }

    public void ride() {
        System.out.println("Машина " + brand + " едет!");
    }
    public void cargo() {
        System.out.println("Везу груз!");
    }
    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
