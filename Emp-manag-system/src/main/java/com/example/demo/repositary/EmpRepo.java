package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer>
{
	

}
