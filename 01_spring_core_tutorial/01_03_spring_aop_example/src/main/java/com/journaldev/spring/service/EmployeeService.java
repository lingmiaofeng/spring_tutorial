package com.journaldev.spring.service;

import com.journaldev.spring.model.Employee;

public class EmployeeService {

    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
