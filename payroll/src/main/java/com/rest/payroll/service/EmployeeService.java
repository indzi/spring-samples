package com.rest.payroll.service;

import com.rest.payroll.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    public List<EmployeeEntity> getAllEmployees();
    public EmployeeEntity createNewEmployee(EmployeeEntity employeeEntity);
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity, Long id);
    public EmployeeEntity findEmployee(Long id);
    public void deleteEmployee(Long id);
}
