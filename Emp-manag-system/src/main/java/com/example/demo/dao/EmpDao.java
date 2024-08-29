package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Emp;
import com.example.demo.repositary.EmpRepo;
import com.example.demo.service.EmpService;

@Service
public class EmpDao implements EmpService {
	
	@Autowired
	EmpRepo er;

	@Override
	public void savedata(Emp e1) {
		
		er.save(e1);

	}

	@Override
	public List<Emp> displayData() {
		
		return er.findAll();
	}

	@Override
	public Emp getEmpById(int id) {
		
		return er.getById(id);
	}

	@Override
	public Emp getEmpDid(int id) {
		
		er.deleteById(id);;
		return null;
	}

	


}
