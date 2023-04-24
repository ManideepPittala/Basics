package day6;
public class AnonymousObjectDemo {
    // Method to print the details of a person
    public void printDetails(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    // Main method
    public static void main(String[] args) {
        // Create an anonymous object of the AnonymousObjectDemo class
        new AnonymousObjectDemo().printDetails("John", 30);
    }
}
