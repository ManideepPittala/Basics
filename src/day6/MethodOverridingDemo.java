package day6;
// Parent class
class Animal2 {
    public void makeSound() {
        System.out.println("Animal is making a sound...");
    }
}

// Child class inheriting from the Animal class
class Dog2 extends Animal2 {
    // Override the makeSound method in the parent class
    @Override
    public void makeSound() {
        System.out.println("Dog is barking...");
    }
}

// Main class
public class MethodOverridingDemo {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog2 myDog = new Dog2();
        
        // Call the makeSound method on the Dog object
        myDog.makeSound(); // Outputs "Dog is barking..."
    }
}
