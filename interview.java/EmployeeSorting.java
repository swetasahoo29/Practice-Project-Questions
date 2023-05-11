//java employee program to take name and id and sort using id.
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int id;
    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + "]";
    }
}

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", 2),
            new Employee("Mary", 1),
            new Employee("Bob", 4),
            new Employee("Alice", 3)
        );
        
        List<Employee> sortedEmployees = employees.stream()
            .sorted(Comparator.comparingInt(Employee::getId))
            .collect(Collectors.toList());
        
        sortedEmployees.forEach(System.out::println);
    }
}
