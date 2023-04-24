package day6;
public class NamingConventionDemo {
    // Instance variables
    private int count; // Lower camel case
    
    // Constants
    public static final double PI_VALUE = 3.14159; // Upper snake case
    
    // Method to set the count value
    public void setCount(int newCount) { // Lower camel case
        this.count = newCount;
    }
    
    // Method to get the count value
    public int getCount() { // Lower camel case
        return count;
    }
    
    // Main method
    public static void main(String[] args) {
        NamingConventionDemo demo = new NamingConventionDemo();
        demo.setCount(10);
        System.out.println("Count: " + demo.getCount());
        System.out.println("PI value: " + NamingConventionDemo.PI_VALUE);
    }
}
