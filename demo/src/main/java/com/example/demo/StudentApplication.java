package com.example.demo;

import com.example.demo.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
public class StudentApplication{
    @Autowired
    repository ob;
    public static void main(String[] args)
    {
        SpringApplication.run(StudentApplication.class, args);
    }
}

