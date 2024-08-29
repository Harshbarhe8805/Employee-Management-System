package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Emp;

public interface EmpService {
	
	public void savedata(Emp e1);

	public List<Emp> displayData();

	public Emp getEmpById(int id);

	public Emp getEmpDid(int id);


}
