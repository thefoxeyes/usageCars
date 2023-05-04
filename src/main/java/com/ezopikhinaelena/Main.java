package com.ezopikhinaelena;

import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PassengerCar kia = new PassengerCar(Brand.Kia, 2);
        kia.setSunroof(true);
        kia.ride();
        kia.cargo();
        KPP.check(kia);

        System.out.println("");

        Truck volvo = new Truck(Brand.Volvo, 15);
        volvo.setWheelPair(6);
        volvo.ride();
        volvo.cargo();
        KPP.check(volvo);

        System.out.println("");

        Bus scania = new Bus(Brand.Scania, 10);
        scania.setCapacity(40);
        scania.ride();
        scania.cargo();
        KPP.check(scania);

        System.out.println("");

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new PassengerCar(Brand.Kia, 2));
        cars.add(new Truck(Brand.Volvo, 15));
        cars.add(new Bus(Brand.Scania, 10));

        for (Car automobile: cars) {
            KPP.check(automobile);
        }

        System.out.println("");

        for (Map.Entry entry: KPP.history.entrySet()) {
            System.out.println(entry);
        }
    }
}
