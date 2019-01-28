package com.rest.payroll.exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id){
        super("Requested employee with id " + id + " was not found");
    }
}
