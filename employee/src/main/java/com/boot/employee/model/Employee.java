package com.boot.employee.model;

import jakarta.persistence.*;
import lombok.*;


@Data
@Entity
@Table(name = "emp_tbl")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empid")
    private int empId;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "department")
    private String department;

    @Column(name="salary")
    private String salary;

}
