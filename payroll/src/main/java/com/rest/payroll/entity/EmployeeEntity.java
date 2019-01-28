package com.rest.payroll.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class EmployeeEntity {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String department;
    private BigDecimal salary;

    public EmployeeEntity() {
        /*this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;*/
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
