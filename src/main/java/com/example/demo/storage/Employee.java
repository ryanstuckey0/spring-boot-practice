package com.example.demo.storage;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/*
 * Common annotations:
 * @Entity- JPA annotation used to make object ready for storage in a JPA-based data store
 * @Id- another JPA annotation, marking a field as the primary key of an entity
 * @GeneratedValue- JPA annotation telling JPA to automatically generate value for this field
 */

@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    Employee() {
    }

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if ((!(o instanceof Employee)))
            return false;
        Employee employee = ((Employee) o);
        return this.name.equals(employee.name) && this.role.equals(employee.role) && this.id.equals(employee.id);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', role='" + role + "'}";
    }
}
