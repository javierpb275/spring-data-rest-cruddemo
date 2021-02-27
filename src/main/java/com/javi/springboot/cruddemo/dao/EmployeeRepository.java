package com.javi.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javi.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
