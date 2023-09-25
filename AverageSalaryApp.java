package package2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    private String name;
    private double salary;
    private String gender;

    public Employee(String name, double salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }
}

public class AverageSalaryApp {
    public static void main(String[] args) {

        // Create an ArrayList of Employee objects
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("August", 50000.0, "Male"));
        employeeList.add(new Employee("Sakshi", 60000.0, "Female"));
        employeeList.add(new Employee("August", 55000.0, "Male"));
        employeeList.add(new Employee("Anjali", 70000.0, "Female"));
        employeeList.add(new Employee("Tanuj", 52000.0, "Male"));

        // Calculate average salary gender-wise
        Map<String, Double> averageSalaryByGender = new HashMap<>();
        Map<String, Integer> genderCount = new HashMap<>();

        double totalSalary = 0.0;
        int totalCount = 0;

        for (Employee employee : employeeList) {
            String gender = employee.getGender();
            double salary = employee.getSalary();

            averageSalaryByGender.put(gender, averageSalaryByGender.getOrDefault(gender, 0.0) + salary);
            genderCount.put(gender, genderCount.getOrDefault(gender, 0) + 1);

            // Update total salary and total count
            totalSalary += salary;
            totalCount++;
        }

        for (Map.Entry<String, Double> entry : averageSalaryByGender.entrySet()) {
            String gender = entry.getKey();
            double totalGenderSalary = entry.getValue();
            int genderEmployeeCount = genderCount.get(gender);
            double averageGenderSalary = totalGenderSalary / genderEmployeeCount;
            System.out.println("Average salary for " + gender + " employees: " + averageGenderSalary);
        }

        // Calculate and print the overall average salary
        double overallAverageSalary = totalSalary / totalCount;
        System.out.println("Overall Average salary for all employees: " + overallAverageSalary);
    }
}
