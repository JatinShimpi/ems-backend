package com.jatin.ems_backend.controller;

import com.jatin.ems_backend.dto.DepartmentDto;
import com.jatin.ems_backend.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/departments")
@CrossOrigin("*")
@PreAuthorize("hasRole('USER') or " + // Require USER, MODERATOR, or ADMIN role
        "hasRole('MODERATOR') or " +
        "hasRole('ADMIN')")
public class DepartmentController {

    private DepartmentService departmentService;

    @PostMapping

    public ResponseEntity<DepartmentDto> createDepartment(@RequestBody DepartmentDto departmentDto){
       DepartmentDto savedDepartment = departmentService.createDepartment(departmentDto);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<DepartmentDto> getDepartmentByid(@PathVariable("id") String EmployeeId){
        DepartmentDto departmentDto = departmentService.getDepartmentById(EmployeeId);
        return ResponseEntity.ok(departmentDto);
    }

    @GetMapping
    public ResponseEntity<List<DepartmentDto>> getAllDepartments(){
        List<DepartmentDto> departments = departmentService.getAllDepartments();
        return ResponseEntity.ok(departments);
    }

    @PutMapping("{id}")
    public ResponseEntity<DepartmentDto> updateDepartment(@PathVariable("id") String departmentId,@RequestBody DepartmentDto updatedDepartment){
        DepartmentDto departmentDto = departmentService.updateDepartment(departmentId,updatedDepartment);
        return ResponseEntity.ok(departmentDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable("id") String departmentId){
        departmentService.deleteDepartment(departmentId);
        return ResponseEntity.ok("Department with Id "+departmentId+" was succesfully deleted");
    }
}
