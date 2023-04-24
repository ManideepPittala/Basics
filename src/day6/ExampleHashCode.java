package day6;

public class ExampleHashCode {
    private String name;
    private int age;

    public ExampleHashCode (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.age;
        return result;
    }

    public static void main(String[] args) {
    	ExampleHashCode  ex1 = new ExampleHashCode ("John Doe", 30);
    	ExampleHashCode  ex2 = new ExampleHashCode ("John Doe", 30);

        System.out.println(ex1.hashCode());
        System.out.println(ex2.hashCode());
    }
}

