package com.rest.payroll.service;

import com.rest.payroll.entity.EmployeeEntity;
import com.rest.payroll.exception.EmployeeNotFoundException;
import com.rest.payroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<EmployeeEntity> getAllEmployees() {
        List<EmployeeEntity> all = employeeRepository.findAll();
        return all;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity, @PathVariable Long id) {

        EmployeeEntity targetEmployee = employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));

        targetEmployee.setFirstName(employeeEntity.getFirstName());
        targetEmployee.setLastName(employeeEntity.getLastName());
        targetEmployee.setDepartment(employeeEntity.getDepartment());
        targetEmployee.setSalary(employeeEntity.getSalary());

        return employeeRepository.save(targetEmployee);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public EmployeeEntity findEmployee(@PathVariable Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteEmployee(@PathVariable Long id) {
        employeeRepository.deleteById(id);
    }
}
