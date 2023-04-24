package day6;


public class Car {
	
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Toyota", "Corolla", 2020, 20000.00);
		car.setPrice(18000.00);
		System.out.println("The " + car.getYear() + " " + car.getMake() + " " + car.getModel() + " costs $" + car.getPrice());
		
}
}


