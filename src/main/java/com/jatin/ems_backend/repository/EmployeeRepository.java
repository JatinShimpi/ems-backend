package com.jatin.ems_backend.repository;

import com.jatin.ems_backend.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    // You can add custom query methods if needed, such as find by email or department
}
