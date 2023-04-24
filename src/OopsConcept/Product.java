package OopsConcept;

import java.util.*;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();
        cart.add(new Product("Apple", 0.99, 5));
        cart.add(new Product("Banana", 1.25, 3));
        cart.add(new Product("Orange", 0.75, 4));
        cart.add(new Product("Grapes", 2.99, 2));
        cart.add(new Product("Watermelon", 5.99, 1));

        double totalCost = 0;
        for (Product product : cart) {
            totalCost += product.getTotalCost();
        }

        System.out.println("Total cost: $" + totalCost);
    }
}

