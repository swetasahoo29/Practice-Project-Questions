//Given a list of Employee objects, sort the list based on employee salary. Assume Employee class having id, name, salary fields.
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sort {
    
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(23, "Lavender", 20000));
        employees.add(new Employee(23, "Rose", 30000));
        employees.add(new Employee(45, "Lily", 100000));
        employees.add(new Employee(1, "Tulip", 50000));

        Stream<Employee> employeeStream = employees.stream();

        System.out.println(employeeStream.sorted((e1, e2) -> e1.getSalary().compareTo(e2.getSalary())).collect(Collectors.toList()));

    }
}

class Employee {
    private Integer id;
    public String name;
    private Integer salary;

    public Employee(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee " + this.name + " & Salary: " + this.salary;
    }
}

class sortBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSalary().compareTo(e2.getSalary());
    }
}