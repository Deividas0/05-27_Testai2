package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceImplTest {

    @Test
    void performDuties() {
        // Setup
        EmployeeServiceImplTest ESIT = new EmployeeServiceImplTest();
    }

    @Test
    void getEmployeeInfo() {
    }

    @Test
    void promoteEmployee() {
    }

    @Test
    public void increaseSalaryByPercent(){
        //Setup
        Employee employee1 = new Employee("Michael", 26, new BigDecimal(67000));
        BigDecimal expectedValue = employee1.getSalary().multiply(BigDecimal.valueOf(1.1));

        //Execute
        employee1.increaseSalary(BigDecimal.valueOf(1.1));

        //Assert
        assertEquals(expectedValue, employee1.getSalary());


    }
}