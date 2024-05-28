package com.poc.payroll.configuration;

import com.poc.payroll.entity.Employee;
import com.poc.payroll.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

public static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

@Bean
CommandLineRunner initDatabase(EmployeeRepository employeeRepsitory) {
//Spring Boot runs ALL CommandLineRunner beans once the application context is loaded.
    return args->{
        log.info("Pre Loading "+employeeRepsitory.save(new Employee("Yogi", "Admin")));
        log.info("Pre Loading "+ employeeRepsitory.save(new Employee("Adarsh","Sharma")));
    };

}
}
