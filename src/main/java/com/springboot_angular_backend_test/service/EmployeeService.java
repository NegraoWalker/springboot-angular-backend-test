package com.springboot_angular_backend_test.service;

import com.springboot_angular_backend_test.exception.ResourceNotFoundException;
import com.springboot_angular_backend_test.model.Employee;
import com.springboot_angular_backend_test.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findByIdEmployee(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
    }

    public Employee updateEmployee(Long id, Employee employeeDetails) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setEmailId(employeeDetails.getEmailId());
        employee.setNumberNis(employeeDetails.getNumberNis());

        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
        employeeRepository.delete(employee);
    }
}
