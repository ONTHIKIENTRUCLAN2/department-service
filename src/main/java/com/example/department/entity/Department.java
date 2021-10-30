package com.example.department.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Departments")
public class Department {
    @Id
    private Long Id;
    private String DepartmentName;
    private double price;
}
