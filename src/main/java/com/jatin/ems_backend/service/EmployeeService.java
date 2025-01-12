package com.jatin.ems_backend.service;

import com.jatin.ems_backend.dto.EmployeeDto;
import com.jatin.ems_backend.entity.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(String employeeId);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto updateEmployee(String employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(String employeeId);
}
