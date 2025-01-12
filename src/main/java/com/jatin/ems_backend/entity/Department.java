package com.jatin.ems_backend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "departments")  // MongoDB collection name
public class Department {

    @Id  // MongoDB primary key
    private String id;  // MongoDB typically uses String type for the ID

    private String departmentName;

    private String departmentDescription;
}
