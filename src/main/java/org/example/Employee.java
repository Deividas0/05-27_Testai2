package org.example;

import java.math.BigDecimal;

public class Employee {
    String name;
    int age;
    BigDecimal salary;

    public Employee(String name, int age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void increaseSalary(BigDecimal increasePercent) {
        BigDecimal increment = salary.multiply(increasePercent);
        this.salary = increment;
    }

    @Override
    public String toString() {
        return "Employee name: " + name + ". Age: " + age + ". Salary: " + salary + "/year. ";
    }
}
