package day6;
public class Person {
    private String name;
    private int age;
    
    public Person() { //default Constructor
    	name="John";
    	age=20;
    }
    
    // Constructor
    public Person(String name, int age) {//Parameterized Constructor
        this.name = name;
        this.age = age;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Main method to test the constructor
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        
        Person person2 = new Person("Jane", 30);
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
    }
}
