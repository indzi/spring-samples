package com.rest.payroll.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class EmployeeEntity {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String department;
    private BigDecimal salary;

    public EmployeeEntity(String firstName, String lastName, String department, BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }
}
