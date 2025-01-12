package com.jatin.ems_backend.repository;

import com.jatin.ems_backend.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department, String> {
    // You can add custom query methods if needed, such as find by department name or description
}
