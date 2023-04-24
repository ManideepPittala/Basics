package day6;

public class Example {
    private int value;

    public Example(int value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Example)) {
            return false;
        }

        Example other = (Example) obj;
        return this.value == other.value;
    }

    public static void main(String[] args) {
        Example ex1 = new Example(10);
        Example ex2 = new Example(10);
        Example ex3 = new Example(20);

        System.out.println(ex1.equals(ex2)); // true
        System.out.println(ex1.equals(ex3)); // false
    }
}

