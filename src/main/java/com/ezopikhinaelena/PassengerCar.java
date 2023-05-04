package com.ezopikhinaelena;

public class PassengerCar extends Car{


    private boolean sunroof;

    public PassengerCar(Brand brand, int weight) {
        super(brand, weight);
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }
    @Override
    public void cargo() {
        System.out.println("Везу семью!");
    }

}
