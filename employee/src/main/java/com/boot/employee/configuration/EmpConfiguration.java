package com.boot.employee.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfiguration {
@Bean
    public ModelMapper modelMapper(){
        return  new ModelMapper();
    }
}
