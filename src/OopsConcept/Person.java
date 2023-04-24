package OopsConcept;

import java.util.*;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public boolean isEligibleToVote() {
        return age >= 18;
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, "Female"));
        people.add(new Person("Bob", 16, "Male"));
        people.add(new Person("Charlie", 20, "Male"));
        people.add(new Person("David", 30, "Male"));
        people.add(new Person("Eve", 17, "Female"));
        people.add(new Person("Frank", 19, "Male"));
        people.add(new Person("Grace", 18, "Female"));
        people.add(new Person("Henry", 23, "Male"));
        people.add(new Person("Isabel", 21, "Female"));
        people.add(new Person("Jack", 15, "Male"));

        System.out.println("Eligible voters:");
        for (Person person : people) {
            if (person.isEligibleToVote()) {
                System.out.println(person.getName());
            }
        }
    }
}

