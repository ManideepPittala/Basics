package OopsConcept;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private String type;
    
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getType() {
        return this.type;
    }
    
    public boolean isDomestic() {
        if (this.type.equalsIgnoreCase("dog") ||
            this.type.equalsIgnoreCase("cat") ||
            this.type.equalsIgnoreCase("horse")) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fido", "dog"));
        animals.add(new Animal("Whiskers", "cat"));
        animals.add(new Animal("Buddy", "horse"));
        animals.add(new Animal("Lion", "wild"));
        animals.add(new Animal("Tiger", "wild"));
        
        System.out.println("Domestic animals:");
        for (Animal animal : animals) {
            if (animal.isDomestic()) {
                System.out.println(animal.getName());
            }
        }
    }
}

