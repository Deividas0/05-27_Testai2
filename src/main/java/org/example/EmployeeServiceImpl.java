package org.example;

import org.example.Employee;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    public EmployeeServiceImpl(List<Employee> team) {
    }


    @Override
    public void performDuties(Employee employee) {
        if (employee instanceof Manager) {
            if (((Manager) employee).getTeamSize() > 10) {
                System.out.println(employee.name + " is a Manager to a big team of " + ((Manager) employee).teamSize);
            } else {
                System.out.println(employee.name + " is a Manager to a small team of " + ((Manager) employee).teamSize);
            }
        }
        if (employee instanceof Developer) {
            if (((Developer) employee).getProgrammingLanguage() == "C#") {
                System.out.println(employee.name + " is a Master Developer of C# programming language and is earning "
                        + employee.salary + "$ / year.");
            } else if (((Developer) employee).getProgrammingLanguage() == "Java") {
                System.out.println(employee.name + " is a Master Developer of Java programming language and is earning "
                        + employee.salary + "$ / year.");
            } else {
                System.out.println(employee.name + " is a Master Developer of " + ((Developer) employee).getProgrammingLanguage()
                        + " Java programming language and is earning " + employee.salary + "$ / year.");
            }
        }
    }


    @Override
    public String getEmployeeInfo(Employee employee) {
        return employee.toString();
    }

    public void increaseSalaryByPercent(Employee employee) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of how many percent you would like to increase the salary.");
        //int input = sc.nextInt();
        double percent = 1.1;
        BigDecimal increasePercent = new BigDecimal(percent);
        employee.increaseSalary(increasePercent);
    }

    @Override
    public void promoteEmployee(Employee employee) {
        if (employee instanceof Manager) {
            if (((Manager) employee).getTeamSize() < 15) {
                ((Manager) employee).setTeamSize(((Manager) employee).getTeamSize() + 1);
                System.out.println(employee.name + " team size was increased by 1 and new size is: " + ((Manager) employee).getTeamSize());
            } else {
                increaseSalaryByPercent(employee);
                DecimalFormat df = new DecimalFormat("#");
                System.out.println(employee.name + " salary was increased by 10%. New salary is: " + df.format(employee.getSalary()));
            }
        }
//        if (employee instanceof Developer) {
//            if (((Developer) employee).getProgrammingLanguage() == "Java"){
//                increaseSalaryByPercent(employee);
//                DecimalFormat df = new DecimalFormat("#.00");
//                System.out.println(employee.name + " salary was increased by 10%. New salary is: " + df.format(employee.getSalary()));
//            }
//        }
    }
}

