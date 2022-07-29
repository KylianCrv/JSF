package fr.m2i.jsfwebapp;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "userData", eager = true)
public class UserData {

    private final List<Employee> employees = new ArrayList() {
        {
            add(new Employee("Kylian", "IT", 25, 3000));
            add(new Employee("John", "marketing", 42, 3700));
            add(new Employee("Joe", "Sales", 38, 1800));
        }
    };

    public List<Employee> getEmployees() {
        return employees;
    }

}
