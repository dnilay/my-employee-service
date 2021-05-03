package com.example.myemployeeservice;

import com.example.myemployeeservice.model.Employee;
import com.example.myemployeeservice.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyEmployeeServiceApplication implements CommandLineRunner {
private EmployeeRepository employeeRepository;

    public MyEmployeeServiceApplication(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyEmployeeServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        employeeRepository.save(new Employee("John","Doe","John@email.com"));
        employeeRepository.save(new Employee("Marry","Public","marry@email.com"));
        employeeRepository.save(new Employee("Sachin","Tendulkar","sachin@email.com"));
        employeeRepository.save(new Employee("Rahul","Dravid","rahul@email.com"));
    }
}
