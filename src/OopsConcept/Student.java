package OopsConcept;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public double getPercentageMarks() {
        return (double) marks / 100 * 100;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1, 75));
        students.add(new Student("Bob", 2, 80));
        students.add(new Student("Charlie", 3, 85));
        students.add(new Student("David", 4, 90));
        students.add(new Student("Emily", 5, 95));

        for (Student student : students) {
            System.out.println(student.name + ": " + student.getPercentageMarks() + "%");
        }
    }
}

