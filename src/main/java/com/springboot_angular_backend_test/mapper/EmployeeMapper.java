package com.springboot_angular_backend_test.mapper;

import com.springboot_angular_backend_test.dto.EmployeeDto;
import com.springboot_angular_backend_test.model.Employee;
import org.modelmapper.ModelMapper;

public class EmployeeMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    public static Employee toEmployee(EmployeeDto employeeDto) {
        return modelMapper.map(employeeDto, Employee.class);
    }

    public static EmployeeDto toEmployeeDto(Employee employee) {
        return modelMapper.map(employee, EmployeeDto.class);
    }
}
