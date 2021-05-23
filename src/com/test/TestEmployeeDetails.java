package com.test;

import com.test.employee.bean.EmployeeDetails;
import com.test.employee.logic.EmpBusinessLogic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEmployeeDetails {
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails employeeDetails = new EmployeeDetails();

    //test to check appraisal
    @Test
    public void testCalculateAppraisal() {
        employeeDetails.setName("Rajeev");
        employeeDetails.setAge(25);
        employeeDetails.setMonthlySalary(8000);

        assertEquals(500, empBusinessLogic.calculateAppraisal(employeeDetails), 0.0);
    }

    //test to check yearly salary
    @Test
    public void testCalculateYearlySalary() {
        employeeDetails.setName("Rajeev");
        employeeDetails.setAge(25);
        employeeDetails.setMonthlySalary(8000);

        assertEquals(96000, empBusinessLogic.calculateYearlySalary(employeeDetails), 0.0);
    }
}
