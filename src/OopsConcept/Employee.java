package OopsConcept;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 123, 5000.0));
        employees.add(new Employee("Jane Smith", 456, 7000.0));
        employees.add(new Employee("Bob Johnson", 789, 6000.0));
        employees.add(new Employee("Alice Lee", 101, 9000.0));

        // Sort the employees by salary in descending order
        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        // Display the details of the top 3 highest-paid employees
        for (int i = 0; i < 3 && i < employees.size(); i++) {
            Employee employee = employees.get(i);
            System.out.println("Name: " + employee.getName());
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }
    }
}

