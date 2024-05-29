package org.example;

import org.example.Employee;

import java.math.BigDecimal;

public class Manager extends Employee {
    int teamSize;

    public Manager(String name, int age, BigDecimal salary, int teamSize) {
        super(name, age, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;}

    public void setTeamSize(int teamSize) {this.teamSize = teamSize;}


    @Override
    public String toString(){
        return "Manager name: " + name + ". Age: " + age + ". Salary: " + salary + ". Team size: "
                + teamSize + ". ";
    }
}
