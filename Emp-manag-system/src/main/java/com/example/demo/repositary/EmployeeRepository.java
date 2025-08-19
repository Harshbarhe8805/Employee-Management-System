package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// interface extending Jpa repository
@Repository
public interface EmployeeRepository extends JpaRepository<com.example.demo.entity.Employee, Integer>{
	
}
