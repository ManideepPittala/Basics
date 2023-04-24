package day6;
// Parent class
class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
}

// Child class
class Dog extends Animal {
    public void bark() {
        System.out.println("Barking...");
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog();
        
        // Call methods from the parent and child classes
        myDog.eat(); // Inherited from the Animal class
        myDog.bark(); // Defined in the Dog class
    }
}
//This also an example for the single Inheritance........