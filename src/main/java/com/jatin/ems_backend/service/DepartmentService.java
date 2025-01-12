package com.jatin.ems_backend.service;

import com.jatin.ems_backend.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {
    DepartmentDto createDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentById(String departmentId);

    List<DepartmentDto> getAllDepartments();

    DepartmentDto updateDepartment(String departmentId, DepartmentDto updatedDepartment);

    void deleteDepartment(String departmentId);


}
