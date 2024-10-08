package com.springboot_angular_backend_test.controller;

import com.springboot_angular_backend_test.dto.EmployeeDto;
import com.springboot_angular_backend_test.mapper.EmployeeMapper;
import com.springboot_angular_backend_test.model.Employee;
import com.springboot_angular_backend_test.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees =  employeeService.findAllEmployee();
        return ResponseEntity.status(HttpStatus.OK).body(employees);
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody @Valid EmployeeDto employeeDto) {
        Employee employee = employeeService.saveEmployee(EmployeeMapper.toEmployee(employeeDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(employee);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        Employee employee = employeeService.findByIdEmployee(id);
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody @Valid EmployeeDto employeeDetailsDto){
        Employee updatedEmployee = employeeService.updateEmployee(id, EmployeeMapper.toEmployee(employeeDetailsDto));
        return ResponseEntity.status(HttpStatus.OK).body(updatedEmployee);
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
