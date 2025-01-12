package com.jatin.ems_backend.security.repository;

import java.util.Optional; // Import Optional for handling optional values

// Import EmployeeRole enumeration
 // Import Role model
import com.jatin.ems_backend.security.entities.EmployeeRole;
import com.jatin.ems_backend.security.entities.Role;
import org.springframework.data.mongodb.repository.MongoRepository; // Import MongoRepository for MongoDB operations

/**
 * Repository interface for accessing Role entities in the MongoDB database.
 * It extends MongoRepository, providing CRUD operations for Role objects.
 */
public interface RoleRepository extends MongoRepository<Role, String> {

  /**
   * Find a Role by its name.
   *
   * @param name The name of the role represented as an EmployeeRole enum.
   * @return An Optional containing the Role if found, or empty if not found.
   */
  Optional<Role> findByName(EmployeeRole name);
}
