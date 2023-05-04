package com.ezopikhinaelena;

import java.util.HashMap;

public class KPP {
    static HashMap<Integer, String> history = new HashMap<>();
    static int count = 1;

    public static void check(Car car) {
        history.put(count++, car.getBrand().name());
        if (car instanceof PassengerCar)
        {
            System.out.println("Можете ехать!");
        } else if (car instanceof Truck) {
            System.out.println("Заплати и едь спокойно!");
        }
        else {
            System.out.println("Необходимо уточнение типа ТС");
        }

    }
}
