package com.second;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        Product vos = new Phone("Vsmart", 2010);
        Product mac = new Comp("Mac Book", 2022);
        Product kdk = new Camera("Kodak", 2015);
        Product pdt = new Product() {
            {
                super.model = "Untitled";
                super.yearOC = 0;
            }
        };

        Map<Product, Double> productPrice = new TreeMap<>();
        Map<Product, Double> productPriceC = new TreeMap<>(Comparator.comparing(p -> p.model));

        productPrice.put(vos, 11.999);
        productPrice.put(mac, 35.999);
        productPrice.put(kdk, 5.999);
        productPrice.put(pdt, 0.9);

        productPriceC.put(vos, 11.999);
        productPriceC.put(mac, 35.999);
        productPriceC.put(kdk, 5.999);


        for (Product p : productPrice.keySet()
        ) {
            System.out.println(p + " " + productPrice.get(p));
        }
        System.out.println("------------------------");

        for (Product p : productPriceC.keySet()
        ) {
            System.out.println(p + " " + productPrice.get(p));
        }
    }


}

abstract class Product implements Comparable<Product> {

    String model;
    int yearOC;

    @Override
    public String toString() {
        return getClass() + " - " + model + ' ' + yearOC;
    }
    @Override
    public int compareTo(Product p) {
        return yearOC - p.yearOC;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return yearOC == product.yearOC &&
                Objects.equals(model, product.model);
    }
    @Override
    public int hashCode() {
        return Objects.hash(model, yearOC);
    }
}

class Phone extends Product {
    Phone(String model, int yearOC) {
        super.model = model;
        super.yearOC = yearOC;
    }
}

class Comp extends Product {
    Comp(String model, int yearOC) {
        super.model = model;
        super.yearOC = yearOC;
    }
}

class Camera extends Product {
    Camera(String model, int yearOC) {
        super.model = model;
        super.yearOC = yearOC;
    }
}