package com.boot.employee.service;

import com.boot.employee.model.Employee;
import com.boot.employee.repository.EmpRepository;
import com.boot.employee.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EmployeeService {
    @Autowired
    private EmpRepository empRepository;
    @Autowired
    private ModelMapper mapper;


    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    public EmployeeResponse getEmployeeById(int empId) {

        Optional<Employee> employee = empRepository.findById(empId);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
        return employeeResponse;
    }


}
