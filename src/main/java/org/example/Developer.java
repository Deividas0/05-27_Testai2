package org.example;

import org.example.Employee;

import java.math.BigDecimal;

public class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int age, BigDecimal salary, String programmingLanguage) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;}



    @Override
    public String toString(){
        return "Developer name: " + name + ". Age: " + age + ". Salary: " + salary + ". Programming language: "
                + programmingLanguage + ". ";
    }
}
