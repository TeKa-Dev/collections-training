package com.second;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapEx {
    public static void main(String[] args) {
        Cars bmw = new Cars("BMW", 2010);
        Cars bmw2 = new Cars("BMW", 2010);
        Cars vaz = new Cars("Лада", 2008);

//        System.out.println(bmw.equals(bmw2));
//        System.out.println(bmw.equals(vaz));
//        System.out.println(bmw.hashCode());
//        System.out.println(bmw2.hashCode());
//        System.out.println(vaz.hashCode());

        Map<Cars, Integer> carsMap = new HashMap<>(6, 0.75f);
        carsMap.put(bmw, 9454);
        carsMap.put(vaz, 5673);
        carsMap.put(bmw2, 9356);

        System.out.println(carsMap);
        System.out.println("цена автомобиля ваз " + carsMap.get(vaz));
        vaz.year = 2007;
        System.out.println("цена автомобиля ваз " + carsMap.get(vaz));


    }

}

final class Cars {
    final String model;
    int year;

    Cars(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return year == cars.year && Objects.equals(model, cars.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    @Override
    public String toString() {
        return model + " " + year + "г.в.";
    }
}