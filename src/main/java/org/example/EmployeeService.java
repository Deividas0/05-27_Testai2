package org.example;

import org.example.Employee;

public interface EmployeeService {

    void performDuties(Employee employee);
    String getEmployeeInfo(Employee employee);
    void promoteEmployee(Employee employee);
}
