
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    int id;
    String name;
    double salary;
    String department;

    // Constructor
    Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Display method
    void display() {
        System.out.println(id + " | " + name + " | " + salary + " | " + department);
    }
}

public class EmployeeFilterProgram {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        // Adding 10 employees
        employees.add(new Employee(1, "Arun", 35000, "IT"));
        employees.add(new Employee(2, "Bala", 25000, "HR"));
        employees.add(new Employee(3, "Cathy", 45000, "Finance"));
        employees.add(new Employee(4, "David", 28000, "IT"));
        employees.add(new Employee(5, "Esha", 50000, "HR"));
        employees.add(new Employee(6, "Farhan", 32000, "Finance"));
        employees.add(new Employee(7, "Gopi", 22000, "IT"));
        employees.add(new Employee(8, "Hari", 60000, "Finance"));
        employees.add(new Employee(9, "Isha", 27000, "HR"));
        employees.add(new Employee(10, "John", 38000, "IT"));

        // Task 1: Salary > 30000
        System.out.println("Employees with salary > 30000:");
        for (Employee emp : employees) {
            if (emp.salary > 30000) {
                emp.display();
            }
        }

        // Task 2: Group by Department
        System.out.println("\nEmployees grouped by department:");

        String[] departments = {"IT", "HR", "Finance"};

        for (String dept : departments) {
            System.out.println("\nDepartment: " + dept);
            for (Employee emp : employees) {
                if (emp.department.equals(dept)) {
                    emp.display();
                }
            }
        }

        // Task 3: Sort by Name
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        });

        System.out.println("\nEmployees sorted by name:");
        for (Employee emp : employees) {
            emp.display();
        }
    }
}