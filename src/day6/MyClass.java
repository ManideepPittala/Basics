package day6;

public class MyClass {
    private int privateField;
    protected int protectedField;
    int defaultField;
    public int publicField;

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defaultMethod() {
        System.out.println("This is a default method");
    }

    public void publicMethod() {
        System.out.println("This is a public method");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Trying to access private fields and methods will result in a compilation error
        // myClass.privateField = 1;
        // myClass.privateMethod();

        // We can access protected, default, and public fields and methods
        myClass.protectedField = 2;
        myClass.protectedMethod();

        myClass.defaultField = 3;
        myClass.defaultMethod();

        myClass.publicField = 4;
        myClass.publicMethod();
    }

}
