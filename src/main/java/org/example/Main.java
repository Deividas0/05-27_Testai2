package org.example;

import org.example.Employee;
import org.example.EmployeeServiceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Employee> team = new ArrayList<>();

        Employee employee1 = new Employee("Michael", 26, new BigDecimal(67000));
        Employee employee2 = new Employee("Sara", 28, new BigDecimal(71000));
        Manager manager1 = new Manager("John", 31, new BigDecimal(79000), 5);
        Manager manager2 = new Manager("Steven", 51, new BigDecimal(87000), 12);
        Developer developer1 = new Developer("Kimberley", 21, new BigDecimal(110000), "C#");
        Developer developer2 = new Developer("Amber", 25, new BigDecimal(121000), "Java");

        team.add(employee1);
        team.add(employee2);
        team.add(manager1);
        team.add(manager2);
        team.add(developer1);
        team.add(developer2);


        startUP(team);
    }

    public static void startUP(List<Employee> team) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose options: ");
        System.out.println("1. CALL performDuties() method.");
        System.out.println("2. CALL getEmployeeInfo() method.");
        System.out.println("3. CALL promoteEmployee() method.");
        int nr = sc.nextInt();
        EmployeeServiceImpl ESI = new EmployeeServiceImpl(team);
        switch (nr) {
            case 1:
                for(Employee a : team) {
                    ESI.performDuties(a);
                }
                System.out.println();
                startUP(team);
            case 2:
                for(Employee a : team){
                    ESI.getEmployeeInfo(a);
                    String employeeInfo = ESI.getEmployeeInfo(a);
                    System.out.println(employeeInfo);
                }
                System.out.println();
                startUP(team);
            case 3:
                for(Employee a : team){
                    ESI.promoteEmployee(a);
                }
                System.out.println();
                startUP(team);
        }
    }
}