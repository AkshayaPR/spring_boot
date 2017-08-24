package com.kgfsl.springbootconfig.repository;

import com.kgfsl.springbootconfig.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}