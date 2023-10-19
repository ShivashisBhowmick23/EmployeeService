package com.boot.employee.controller;

import com.boot.employee.response.EmployeeResponse;
import com.boot.employee.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeService employeeService;

    private EmployeeResponse employeeResponse;

    @GetMapping("/employees/{empId}")
    private ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("empId") int empId) throws Exception {
        try {
            EmployeeResponse employee = employeeService.getEmployeeById(empId);
            logger.info("Staring finding employee details with id: " +empId);
            logger.info("Excecuting getEmployeeDetails method...");
            return ResponseEntity.status(HttpStatus.OK).body(employee);
        }
        catch (Exception ex) {
            throw new Exception ("User Id " + employeeResponse.getEmpId()
                    + " Not Found");
        }
    }
}
