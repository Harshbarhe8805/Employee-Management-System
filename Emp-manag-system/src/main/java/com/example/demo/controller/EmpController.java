package com.example.demo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Emp;
import com.example.demo.entity.manager;
import com.example.demo.service.EmpService;


@Controller
public class EmpController {
	
	@Autowired
	EmpService es;
	
	
	@GetMapping("/")
	public String home(Model m)
	{
		List<Emp> l1=es.displayData();
		
		m.addAttribute("kk",l1);
		
		return "index";
	}
	
	@GetMapping("/add_emp")
	public String addemp()
	{
		return "add_emp";
	}
	
	@PostMapping("/saveinfo")
	public String addData(@ModelAttribute("e1") Emp e1)
	{
		es.savedata(e1);
		
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String editdata(@PathVariable int id, Model m)
	{
		Emp e=es.getEmpById(id);
		m.addAttribute("kp", e);
		return "edit";
	}
	
	@PostMapping("/update")
	public String updatedata(@ModelAttribute Emp e1)
	{
		Emp em = new Emp();
		
		em.setEid(e1.getEid());
		em.setEname(e1.getEname());
		em.setEemail(e1.getEemail());
		em.setEcontact_no(e1.getEcontact_no());
		em.setEcity(e1.getEcity());
		em.setEsalary(e1.getEsalary());
		
		es.savedata(em);
	
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deletedata(@PathVariable int id)
	{
		es.getEmpDid(id);
		
		return "redirect:/";
	}
	

}
