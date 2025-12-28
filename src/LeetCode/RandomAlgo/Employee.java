package LeetCode.RandomAlgo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Binita", 40, 5000));
        employeeList.add(new Employee("Gurkirat", 56, 9000));
        employeeList.add(new Employee("Sudip", 80, 8000));
        employeeList.add(new Employee("Aashish", 69, 10000));


        //print employees with age>50

       employeeList.stream()
                .filter(employee -> employee.getAge() > 50)
                .sorted(Comparator.comparingInt(Employee::getAge))
                .forEach(employee ->
                        System.out.println(employee.getName() + "|"+ employee.getAge()+"|" +employee.getSalary() + "|" ));

        employeeList.stream()
                .filter(employee -> employee.getSalary() < 9000)
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .forEach(employee ->
                        System.out.println(employee.getName()));
    }
}
