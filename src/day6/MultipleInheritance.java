package day6;
// Grandparent class
class Animal1 {
    public void eat() {
        System.out.println("Eating...");
    }
}

// Parent class inheriting from the Animal class
class Dog1 extends Animal1 {
    public void bark() {
        System.out.println("Barking...");
    }
}

// Child class inheriting from the Dog class
class Poodle extends Dog1 {
    public void groom() {
        System.out.println("Grooming...");
    }
}

// Main class
public class MultipleInheritance {
    public static void main(String[] args) {
        // Create an object of the Poodle class
        Poodle myPoodle = new Poodle();
        
        // Call methods from the grandparent, parent, and child classes
        myPoodle.eat(); // Inherited from the Animal class
        myPoodle.bark(); // Inherited from the Dog class
        myPoodle.groom(); // Defined in the Poodle class
    }
}
