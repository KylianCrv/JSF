package fr.m2i.jsfwebapp;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "userData", eager = true)
public class UserData {

    private static final List<Employee> employees = new ArrayList() {
        {
            add(new Employee("Kylian", "IT", 25, 3000));
            add(new Employee("John", "marketing", 42, 3700));
            add(new Employee("Joe", "Sales", 38, 1800));
        }
    };

    private String name;
    private String department;
    private int age;
    private int salary;

    public String addEmployee() {

        Employee employee = new Employee(name, department, age, salary);
        employees.add(employee);

        name = null;
        department = null;
        age = 0;
        salary = 0;

        return null;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
