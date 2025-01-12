package com.jatin.ems_backend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "employees")  // MongoDB collection name
public class Employee {

    @Id  // MongoDB primary key
    private String id;  // MongoDB typically uses String type for the ID

    private String firstName;

    private String lastName;

    private String email;

    @DBRef  // MongoDB reference to another document (Department)
    private Department department;  // Department is referenced by its ID in MongoDB

}
