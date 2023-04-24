package OopsConcept;

import java.util.*;

public class Car {
    private String make;
    private String model;
    private int year;

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(createCar("Honda", "Accord", 2010));
        cars.add(createCar("Toyota", "Camry", 2015));
        cars.add(createCar("Ford", "Mustang", 2020));
        cars.add(createCar("Chevrolet", "Corvette", 2021));
        cars.add(createCar("Tesla", "Model S", 2019));

        for (Car car : cars) {
            System.out.println("Make: " + car.getMake());
            System.out.println("Model: " + car.getModel());
            System.out.println("Year: " + car.getYear());
            System.out.println();
        }
    }

    private static Car createCar(String make, String model, int year) {
        Car car = new Car();
        car.setMake(make);
        car.setModel(model);
        car.setYear(year);
        return car;
    }
}

