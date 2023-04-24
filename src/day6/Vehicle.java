package day6;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private double price;

    public Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}

 class Car1 extends Vehicle {
    private int numDoors;

    public Car1(String make, String model, int year, double price, int numDoors) {
        super(make, model, year, price);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }
}

 class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String make, String model, int year, double price, double payloadCapacity) {
        super(make, model, year, price);
        this.payloadCapacity = payloadCapacity;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }
}

 class Motorcycle extends Vehicle {
    private String style;

    public Motorcycle(String make, String model, int year, double price, String style) {
        super(make, model, year, price);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }


    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2020, 25000.0);
        System.out.println(vehicle.getMake() + " " + vehicle.getModel() + " (" + vehicle.getYear() + ") $" + vehicle.getPrice());

        Car1 car = new Car1("Honda", "Civic", 2018, 20000.0, 4);
        System.out.println(car.getMake() + " " + car.getModel() + " (" + car.getYear() + ") $" + car.getPrice() + " " + car.getNumDoors() + "-door");

        Truck truck = new Truck("Ford", "F-150", 2019, 35000.0, 2000.0);
        System.out.println(truck.getMake() + " " + truck.getModel() + " (" + truck.getYear() + ") $" + truck.getPrice() + " " + truck.getPayloadCapacity() + " lb payload capacity");

        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, 12000.0, "cruiser");
        System.out.println(motorcycle.getMake() + " " + motorcycle.getModel() + " (" + motorcycle.getYear() + ") $" + motorcycle.getPrice() + " " + motorcycle.getStyle() + " style");
    }
}
