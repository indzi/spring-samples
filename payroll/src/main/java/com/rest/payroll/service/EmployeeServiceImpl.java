package com.rest.payroll.service;

import com.rest.payroll.entity.EmployeeEntity;
import com.rest.payroll.exception.EmployeeNotFoundException;
import com.rest.payroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<EmployeeEntity> getAllEmployees() {
        List<EmployeeEntity> all = employeeRepository.findAll();
        return all;
    }

    @PostMapping("/employees")
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @PutMapping("/employees/{id}")
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity, @PathVariable Long id) {

        EmployeeEntity targetEmployee = employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));

        targetEmployee.setFirstName(employeeEntity.getFirstName());
        targetEmployee.setLastName(employeeEntity.getLastName());
        targetEmployee.setDepartment(employeeEntity.getDepartment());
        targetEmployee.setSalary(employeeEntity.getSalary());

        return employeeRepository.save(targetEmployee);
    }

    @GetMapping("/employees/{id}")
    public EmployeeEntity findEmployee(@PathVariable Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeRepository.deleteById(id);
    }
}
