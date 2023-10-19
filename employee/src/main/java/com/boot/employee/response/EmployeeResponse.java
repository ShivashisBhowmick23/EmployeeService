package com.boot.employee.response;

import lombok.Data;

@Data
public class EmployeeResponse {
    private  int empId;
    private String firstName;
    private String lastName;
    private int age;
    private String department;
    private  String salary;
    public  String getFullName(){
        return getFirstName()+" "+getLastName();
    }



}
