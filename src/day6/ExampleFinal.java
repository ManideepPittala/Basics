package day6;

public class ExampleFinal {
    public static final int MAX_VALUE = 100;

    public final void printMessage() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        // Attempting to modify a final variable will result in a compilation error
        // MAX_VALUE = 200; // Uncommenting this line will result in an error
        
        ExampleFinal ex = new ExampleFinal();
        ex.printMessage();
    }
}

