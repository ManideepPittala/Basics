package day6;

public class ExampleToString {
    private String name;
    private int age;

    public ExampleToString(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }

    public static void main(String[] args) {
        ExampleToString ex = new ExampleToString("John Doe", 30);
        System.out.println(ex.toString());
    }
}

