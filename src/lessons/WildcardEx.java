package lessons;

import java.util.Arrays;
import java.util.List;

public class WildcardEx {
    public static void main(String[] args) {
        Container<Car.Sedan> sdn;
        Container<Bike.Scooter> sct;

        List<Car> cars = Arrays.asList(new Car.Sedan("BMW"), new Car("Mer"));
        List<Car.Sedan> sedans = Arrays.asList(new Car.Sedan("Wag"), new  Car.Sedan("Vaz"));

        copyTransport(sedans, cars);
    }
    static void copyTransport(List<? extends Car> src, List<? super Car> dest) {
        dest.addAll(src);
    }
}
class Container<T extends Transport> {}

class Car implements Transport {
    String model;
    Car(String model) {
        this.model = model;
    }
    static class Sedan extends Car {
        Sedan(String model) {
            super(model);
        }
    }
    static class Pickup extends Car {
        Pickup(String model) {
            super(model);
        }
    }
    static class Truck extends Car {
        Truck(String model) {
            super(model);
        }
    }
}
class Bike implements Transport {
    class Bicycle extends Bike {}
    class Scooter extends Bike {}
    class Motorcycle extends Bike {}
}
interface Transport {}
