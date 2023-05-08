package com.example.demo.exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Employee with ID " + id + " could not be found!");
    }
}
